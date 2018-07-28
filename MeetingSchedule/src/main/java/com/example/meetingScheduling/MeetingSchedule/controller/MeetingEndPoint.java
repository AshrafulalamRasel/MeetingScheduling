package com.example.meetingScheduling.MeetingSchedule.controller;

import com.example.meetingScheduling.MeetingSchedule.modal.Comment;
import com.example.meetingScheduling.MeetingSchedule.modal.Meeting;
import com.example.meetingScheduling.MeetingSchedule.servise.ServicessAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeetingEndPoint {

    @Autowired
    private ServicessAll servicessAll;

    @PostMapping("/meetings")
    public Meeting createMeetingInformaton(@RequestBody Meeting meeting){
        Meeting meetingInformation =servicessAll.createMeetingInformation(meeting);
        return meetingInformation;
    }

    @GetMapping("/meetings")
    public List<Meeting> getAllmeetingInformation(){
       return servicessAll.findAllMeetingInformation();
    }

    @GetMapping("/meetings/{id}")
    public Meeting getMeetingScheduling(@PathVariable long id){
        return servicessAll.findMeetingScheduling(id);
    }

    @PutMapping("/meetings/{id}")
    public Meeting UpdateMeetingScheduling(@PathVariable long id,@RequestBody Meeting meeting){
        return servicessAll.updateMeetingScheduling(id,meeting);
    }

    @DeleteMapping("/meetings/{id}")
    public String deleteMeetingScheduling(@PathVariable long id){
        servicessAll.deleteMeetingSchedulingById(id);
        return String.format("Meeting id #%d successfully deleted",id);
    }

    @PostMapping("/meetings/{id}/comments")
    public Meeting creatrComment(@PathVariable long id , @RequestBody Comment comment){
        return servicessAll.createComment(id,comment);
    }

    @GetMapping("/meetings/{id}/comments")
    public List<Comment> findAllComments(@PathVariable long id){
        return servicessAll.findAllComments(id);
    }

    @GetMapping("/meetings/comments/{id}")
    public Comment findComments(@PathVariable long id){
        return servicessAll.findComments(id);
    }

    @PutMapping("/meetings/comments/{id}")
    public Comment updateComment(@PathVariable long id,@RequestBody Comment comment){
        return servicessAll.updateComment(id,comment);
    }

    @DeleteMapping("/meetings/comments/{id}")
    public String deleteComment(@PathVariable long id){
        servicessAll.deleteCommentById(id);
        return String.format("Comment id %d successfully deleted",id);
    }
}
