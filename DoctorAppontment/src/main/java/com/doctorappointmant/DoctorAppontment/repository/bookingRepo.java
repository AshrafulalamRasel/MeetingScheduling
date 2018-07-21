package com.doctorappointmant.DoctorAppontment.repository;

import com.doctorappointmant.DoctorAppontment.modal.booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface bookingRepo extends CrudRepository<booking,Integer> {

        List<booking> findByDoctname(String name);

}
