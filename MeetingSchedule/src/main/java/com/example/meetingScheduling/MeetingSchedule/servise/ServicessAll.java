package com.example.meetingScheduling.MeetingSchedule.servise;


import com.example.meetingScheduling.MeetingSchedule.modal.Comment;
import com.example.meetingScheduling.MeetingSchedule.modal.Meeting;
import com.example.meetingScheduling.MeetingSchedule.repository.CommentRepository;
import com.example.meetingScheduling.MeetingSchedule.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicessAll {
    @Autowired
    private MeetingRepository meetingRepository;

//-------------------------------------------createMeetingScheduling----------------------------------------------------//
    public Meeting createMeetingInformation(Meeting meeting)
    {
        return meetingRepository.save(meeting);
    }

 //-------------------------------------------FindAllMeetingInformation----------------------------------------------------//
    public List<Meeting> findAllMeetingInformation(){
       return meetingRepository.findAll();
    }
 //-------------------------------------------FindMeetingSchedulingById----------------------------------------------------//
    public Meeting findMeetingScheduling(long id){
        return meetingRepository.findOne(id);
    }

//-------------------------------------------UpdateMeetingScheduling----------------------------------------------------//
    public Meeting updateMeetingScheduling(long id,Meeting meeting){
        Meeting meetingSchedulingUpdate = findMeetingScheduling(id);
        if(!meeting.getOwner().equals(meetingSchedulingUpdate.getOwner())
           &&!meeting.getInvitee().equals(meetingSchedulingUpdate.getInvitee())
           &&!meeting.getLocation().equals(meetingSchedulingUpdate.getLocation())
           &&!meeting.getMeetingPurpose().equals(meetingSchedulingUpdate.getMeetingPurpose())
           &&!meeting.getStartingTime().equals(meetingSchedulingUpdate.getStartingTime())
            &&!meeting.getEndTime().equals(meetingSchedulingUpdate.getEndTime())
            &!meeting.getDate().equals(meetingSchedulingUpdate.getDate()) ){


            meetingSchedulingUpdate.setOwner(meeting.getOwner());
            meetingSchedulingUpdate.setInvitee(meeting.getInvitee());
            meetingSchedulingUpdate.setLocation(meeting.getLocation());
            meetingSchedulingUpdate.setMeetingPurpose(meeting.getMeetingPurpose());
            meetingSchedulingUpdate.setStartingTime(meeting.getStartingTime());
            meetingSchedulingUpdate.setEndTime(meeting.getEndTime());
            meetingSchedulingUpdate.setDate(meeting.getDate());

            return meetingRepository.save(meetingSchedulingUpdate);
        }
        else
            return null;
    }
//-------------------------------------------DeleteMeetingSchedulingBy Id----------------------------------------------------//
    public void deleteMeetingSchedulingById(long id){
        meetingRepository.delete(id);

    }
  //++++===============================================================================================================//
    @Autowired
    private CommentRepository commentRepository;

    public Meeting createComment(long meetingNo,Comment comment){
        Meeting meeting = findMeetingScheduling(meetingNo);
        comment.setMeeting(meeting);
        meeting.getComments().add(comment);
        return meetingRepository.save(meeting);
    }

    public List<Comment> findAllComments(long meetingNo){
        return findMeetingScheduling(meetingNo).getComments();
    }

    public Comment findComments(long id){
        return commentRepository.findOne(id);
    }
    

    public Comment updateComment(long commentId,Comment comment){
        Comment saveComment = commentRepository.findOne(commentId);
        saveComment.setComment(comment.getComment());
        commentRepository.save(saveComment);
        return saveComment;
    }

    public void deleteCommentById(long id){
        commentRepository.delete(id);
    }
}
