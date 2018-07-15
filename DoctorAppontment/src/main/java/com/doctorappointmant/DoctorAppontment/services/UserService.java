package com.doctorappointmant.DoctorAppontment.services;



import com.doctorappointmant.DoctorAppontment.modal.User;
import com.doctorappointmant.DoctorAppontment.modal.booking;
import com.doctorappointmant.DoctorAppontment.repository.UserRepository;
import com.doctorappointmant.DoctorAppontment.repository.bookingRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private  final bookingRepo bookingRepo1;


    public UserService(UserRepository userRepository, bookingRepo bookingRepo1)
    {
        this.userRepository=userRepository;

        this.bookingRepo1 = bookingRepo1;
    }

    public void saveMyUser(User user ) {
        userRepository.save(user);
    }

    public List<User> showAllUsers(){
        List<User> users = new ArrayList<User>();
        for(User user : userRepository.findAll()) {
            users.add(user);
        }

        return users;
    }

    public void deleteMyUser(@RequestParam int id) {
        userRepository.delete(id);
    }

    public User editUser(int id) {
        return userRepository.findOne(id);
    }

    public Iterable<User> search(int id) {
        return userRepository.findAll(Collections.singleton(id));
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    //===============For Booking===================================///

    public void saveMyUserbooking(booking book ) {
        bookingRepo1.save(book);
    }

    public List<booking> showbooking() {
        List<booking> books = new ArrayList<booking>();
        for (booking book : bookingRepo1.findAll()) {
            books.add(book);
        }
        return books;
    }

    public booking editPation(int id) {
        return bookingRepo1.findOne(id);
    }

    public void deletemypation(@RequestParam int id) {
        bookingRepo1.delete(id);
    }
    public Iterable<booking> searchbok(int id) {
        return bookingRepo1.findAll(Collections.singleton(id));
    }
}

