package com.example.meetingScheduling.MeetingSchedule.repository;

import com.example.meetingScheduling.MeetingSchedule.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
