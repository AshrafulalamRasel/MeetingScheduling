package com.example.meetingScheduling.MeetingSchedule.repository;

import com.example.meetingScheduling.MeetingSchedule.modal.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting,Long> {
}
