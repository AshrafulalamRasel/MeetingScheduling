package com.doctorappointmant.DoctorAppontment.controller;

import com.doctorappointmant.DoctorAppontment.modal.User;
import com.doctorappointmant.DoctorAppontment.modal.booking;
import com.doctorappointmant.DoctorAppontment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ApplicationController {

    @Autowired
    UserService userService;
//**************StartingPoint****************************************************************************//
    @RequestMapping("/")
    public String Welcome() {
        return "home";
    }

    @RequestMapping("/booki")
    public String vitobook() {
        return "bookingappoinment";
    }

    //**************Ending startPoint****************************************************************************//


//*********************************Registation Start from User**********************************************//
    @RequestMapping("/registration")
    public String registation() {

        return "Registation";
    }
    @PostMapping("/user_registation")
    public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUser(user);
        return "patient";
    }
//********************************* End Registation  from User**********************************************//


////*********************************Login Start from User**********************************************//
    @RequestMapping("/paitenin")
    public String Patient() {

        return "patient";
    }


    @RequestMapping("/login_user")
    public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
        if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
            return "transLogin";
        }
        else {
            request.setAttribute("error", "Invalid Username or Password");
            return "patient";

        }
    }
////*********************************Login End from User**********************************************//



//*********************************Mydetals*********************************************************//
    @GetMapping("/loginTo")
    public String AllUser(HttpServletRequest request)
    {
        request.setAttribute("users",userService.showAllUsers());

        return "mydetals";
    }
//*********************************End of Mydetals*********************************************************//



// ********************************Update All user ***********************************//

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

    //******************************** End Update All user ***********************************//

    //******************************** Delete All user ***********************************//
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
    //******************************** End Delete All user ***********************************//

    //******************************** Search All user ***********************************//
    @RequestMapping("/searchin")
    public String Searching() {

        return "Searchdetails";
    }

    @PostMapping("/Searchall-user")
    public String Search(@RequestParam int id, HttpServletRequest request)
    {
        request.setAttribute("users", userService.search(id));
        return "mydetals";
    }
    //******************************** End Search All user ***********************************//
//==================================Patirnt registation+++++++++++++++++++++++//
    @RequestMapping("/appoinmentbook")
    public String appoint() {
        return "bookingappoinment";
    }
    @PostMapping("/savebookingn")
    public String booking(@ModelAttribute booking book, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUserbooking(book);
        return "bookingappoinment";
    }

   //================================== End Patirnt registation+++++++++++++++++++++++//


    @GetMapping("/bookingh")
    public String Allbookers(HttpServletRequest request)
    {
        request.setAttribute("books",userService.showbooking());

        return "Viewbookig";
    }

    @RequestMapping("/edit-patient")
    public String editpation(@RequestParam int id,HttpServletRequest request) {
        request.setAttribute("book", userService.editPation(id));
        return "Editpation";
    }
    @PostMapping("/patient_update")
    public String Updatepatient(@ModelAttribute booking book, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUserbooking(book);
        return "Editpation";
    }
    @RequestMapping("/updat")
    public String upon() {
        return "Viewbookig";
    }

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
}


