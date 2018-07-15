package com.doctorappointmant.DoctorAppontment.repository;

import com.doctorappointmant.DoctorAppontment.modal.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsernameAndPassword(String username, String password);

    void delete(int id);
}
