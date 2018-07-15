package com.doctorappointmant.DoctorAppontment.controller;

import com.doctorappointmant.DoctorAppontment.modal.User;
import com.doctorappointmant.DoctorAppontment.modal.booking;
import com.doctorappointmant.DoctorAppontment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserService userService;


    @GetMapping("/saveuser")
    public String saveUser(@RequestParam String username, @RequestParam String address, @RequestParam int age, @RequestParam String mobleNumber,  @RequestParam String password) {
        User user = new User(username, address, age, mobleNumber, password);
        userService.saveMyUser(user);
        return "User Saved";
    }

    //======================For Booking
    @GetMapping("/savebooking")
    public String saveUserbook(@RequestParam String p_name, @RequestParam String d_name, @RequestParam String categoris, @RequestParam String date,  @RequestParam String time) {
        booking book = new booking(p_name, d_name, categoris, date, time);
        userService.saveMyUserbooking(book);
        return "User Saved";
    }

}
