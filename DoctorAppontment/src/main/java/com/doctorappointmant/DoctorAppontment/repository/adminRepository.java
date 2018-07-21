package com.doctorappointmant.DoctorAppontment.repository;



import com.doctorappointmant.DoctorAppontment.modal.admin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface adminRepository extends CrudRepository<admin,Integer> {

    public admin findByDoctornameAndDoctorpass(String username, String password);


}
