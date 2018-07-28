package com.example.meetingScheduling.MeetingSchedule.modal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter@Getter@NoArgsConstructor
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Meeting_No")
    private long meetingNo;
    private String owner;
    private String invitee;
    private String location;
    private String meetingPurpose;
    private String startingTime;
    private String endTime;
    private String date;
    private String status;

    @OneToMany(mappedBy="meeting", cascade=CascadeType.ALL)
    private List<Comment> comments = new ArrayList<Comment>();

    public long getMeetingNo() {
        return meetingNo;
    }

    public void setMeetingNo(long meetingNo) {
        this.meetingNo = meetingNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInvitee() {
        return invitee;
    }

    public void setInvitee(String invitee) {
        this.invitee = invitee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMeetingPurpose() {
        return meetingPurpose;
    }

    public void setMeetingPurpose(String meetingPurpose) {
        this.meetingPurpose = meetingPurpose;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
