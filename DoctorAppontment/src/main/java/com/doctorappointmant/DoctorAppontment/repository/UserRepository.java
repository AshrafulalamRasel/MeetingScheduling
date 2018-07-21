package com.doctorappointmant.DoctorAppontment.repository;

import com.doctorappointmant.DoctorAppontment.modal.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsernameAndPassword(String username, String password);
    List<User> findByUsername(String name);
    void delete(int id);
}
