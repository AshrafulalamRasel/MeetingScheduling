package com.doctorappointmant.DoctorAppontment.controller;

import com.doctorappointmant.DoctorAppontment.modal.User;
import com.doctorappointmant.DoctorAppontment.modal.admin;
import com.doctorappointmant.DoctorAppontment.modal.booking;
import com.doctorappointmant.DoctorAppontment.modal.sendData;
import com.doctorappointmant.DoctorAppontment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class ApplicationController {

    @Autowired
    UserService userService;
    sendData sendData1=new sendData();
//------------------------------------------------------------------StartingPoint-------------------------------------------------------//
    @RequestMapping("/")
    public String Welcome() {
        return "home";
    }

    @RequestMapping("/booki")
    public String vitobook() {
        return "bookingappoinment";
    }

//------------------------------------------------------------------Start end Point-------------------------------------------------------//


//------------------------------------------------------------------Registation Form Start-------------------------------------------------------//

    @RequestMapping("/registration")
    public String registation() {

        return "Registation";
    }
    @PostMapping("/user_registation")
    public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUser(user);
        return "patient";
    }
//-------------------------------------------------------End Registation Form-------------------------------------------------------//



//-----------------------------------------------------------------------------------------------Login Start-------------------------------------------------------//

    @RequestMapping("/paitenin")
    public String Patient() {

        return "patient";
    }


    @RequestMapping("/login_user")
    public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
        if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
            sendData1.setName(user.getUsername());
            return "transLogin";
        }
        else {
            request.setAttribute("error", "Invalid Username or Password");
            return "patient";

        }
    }
//----------------------------------------------------------------------------------------------------Login End-------------------------------------------------------//



//---------------------------------------------------------------------------------------------------Start Mydetails-------------------------------------------------------//

    @GetMapping("/loginTo")
    public String AllUser(HttpServletRequest request)
    {
       List<User> nameAll= userService.showProfule(sendData1.getName());

        request.setAttribute("users",nameAll);

        return "mydetals";
    }
//---------------------------------------------------------------------------------------------------------End Mydetails-------------------------------------------------------//




//-----------------------------------------------------------------------------------------------------------Update Start-------------------------------------------------------//


    @RequestMapping("/edit-user")
    public String editUser(@RequestParam int id,HttpServletRequest request) {
        request.setAttribute("user", userService.editUser(id));
        return "UserUpdate";
    }

    @PostMapping("/user_update")
    public String updateuser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUser(user);
        return "mydetals";
    }

//----------------------------------------------------------------------------------------------------------------End Update-------------------------------------------------------//


    //--------------------------------------------------------------------------------------------Delete Start-------------------------------------------------------//

    @RequestMapping("/delete-user")
    public String deleteUser()
    {
        return "Delete";
    }
    @RequestMapping("/delete-userinfo")
    public String deleteUser(@RequestParam int id, HttpServletRequest request)
    {
        userService.deleteMyUser(id);
        request.setAttribute("users", userService.showAllUsers());
        return "mydetals";
    }
//---------------------------------------------------------------------------------------------------Delete End-------------------------------------------------------//

    //******************************** Search All user ***********************************//
   /* @RequestMapping("/searchin")
    public String Searching() {

        return "Searchdetails";
    }

    @PostMapping("/Searchall-user")
    public String Search(@RequestParam int id, HttpServletRequest request)
    {
        request.setAttribute("users", userService.search(id));
        return "mydetals";
    }*/
    //******************************** End Search All user ***********************************//

 //***************************************End Patient*****************************************//







//---------------------------------------------------------------------------------------------------------Patient Registation-------------------------------------------------------//

    @RequestMapping("/appoinmentbook")
    public String appoint() {
        return "bookingappoinment";
    }
    @PostMapping("/savebookingn")
    public String booking(@ModelAttribute booking book, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMybooking(book);
        return "bookingappoinment";
    }
    @RequestMapping("/checkbook")
    public String bookc() {
        return "bookingappoinment";
    }

 //-----------------------------------------------------------------------------------------------------------End Registation-------------------------------------------------------//


//-----------------------------------------------------------------------------------------------------------------Show All booking-------------------------------------------------------//

    @GetMapping("/bookingh")
    public String Allbookers(HttpServletRequest request)
    {
        request.setAttribute("books",userService.showbooking());

        return "Viewbookig";
    }
//----------------------------------------------------------------------------------------------------------------show all End Booking-------------------------------------------------------//

 //------------------------------------------------------------------------------------------------------------------Booking Update-------------------------------------------------------//

    @RequestMapping("/edit-patient")
    public String editpation(@RequestParam int id,HttpServletRequest request) {
        request.setAttribute("book", userService.editPation(id));
        return "Editpation";
    }
    @PostMapping("/patient_update")
    public String Updatepatient(@ModelAttribute booking book, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMybooking(book);
        return "bookingappoinment";
    }
//----------------------------------------------------------------------------------------------------------------------End Booking Update-------------------------------------------------------//

//-----------------------------------------------------------------------------------------------------------------------Cancle Booking-------------------------------------------------------//

    @RequestMapping("/canclebook")
    public String Cancle() {
        return "Canclebooking";
    }

    @RequestMapping("/delete-pation")
    public String deletepatienti(@RequestParam int id, HttpServletRequest request)
    {
        userService.deletemypation(id);
        request.setAttribute("books", userService.showbooking());
        return "Viewbookig";
    }
//------------------------------------------------------------------------------------------------------------------------End Cancle Booking-------------------------------------------------------//

//------------------------------------------------------------------------------------------------------------------------Search Booking-------------------------------------------------------//

    @RequestMapping("/Serachbook")
    public String Searchingbook() {

        return "SearchPatient";
    }

    @PostMapping("/Searchallpatient")
    public String Searchbok(@RequestParam int id, HttpServletRequest request)
    {
        request.setAttribute("books", userService.searchbok(id));
        return "Viewbookig";
    }
//-------------------------------------------------------------------------------------------------------------------------End Search Booking-------------------------------------------------------//

    @RequestMapping("/logout")
    public String Logout() {

        return "home";
    }
//------------------------------------------------------------------------------------------------------------------------Start Admin Panel-------------------------------------------------------//

    @RequestMapping("/admin")
    public String Admin() {
        return "adminregdoc";
    }

    @PostMapping("/AdminRegistation")
    public String adminRegi(@ModelAttribute admin add, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyadmin(add);
        return "home";
    }

//-------------------------------------------------------------------------------------------------------------------------End Admin Panel-------------------------------------------------------//


//------------------------------------------------------------------Start Doctor Panel-------------------------------------------------------//

    @RequestMapping("/doctor")
    public String Doctor() {
        return "doctorlogin";
    }

    @RequestMapping("/Doctorlogin")
    public String loginDoctor(@ModelAttribute admin add, HttpServletRequest request) {
        if(userService.findByDoctornameAndDoctorpass(add.getDoctorname(), add.getDoctorpass())!=null) {
          sendData1.setNameDoc(add.getDoctorname());
            return "doctorafterlog";
        }
        else {
            request.setAttribute("error", "Invalid Username or Password");
            return "adminregdoc";

        }
    }

    @RequestMapping("/patientio")
    public String patientview(HttpServletRequest request) {
        String name=sendData1.getNameDoc();
    List<booking> showDetails=userService.bookingDetails(name);
        request.setAttribute("show",showDetails);
        return "patientinfo";
    }

    @GetMapping("/doctorinfo")
    public String Alldoctors(HttpServletRequest request)
    {
        request.setAttribute("addm",userService.showAlldoctor());
        return "doctorunfo";
    }

    @RequestMapping("/yourprofile")
    public String Searchingdoctor() {

        return "doctorprofile";
    }

    @PostMapping("/doctorprofileview")
    public String doctorpro(@RequestParam int id, HttpServletRequest request)
    {
        request.setAttribute("addm", userService.searchdoct(id));
        return "doctorunfo";
    }

}


