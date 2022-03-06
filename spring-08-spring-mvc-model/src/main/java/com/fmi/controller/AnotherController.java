package com.fmi.controller;

import com.fmi.enums.Gender;
import com.fmi.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
    @RequestMapping("/another")
    public class AnotherController {

        @RequestMapping("/list")  //localhost:8080/mentor/list
        public String showTable(Model model){

            List<Mentor> mentorList = new ArrayList<> ();
            mentorList.add (new Mentor ("Mike", "Smith", 45, Gender.MALE));
            mentorList.add (new Mentor ("Nike", "Smith", 22, Gender.MALE));
            mentorList.add (new Mentor ("Fake", "Smith", 23, Gender.MALE));
            mentorList.add (new Mentor ("Like", "Smith", 21, Gender.FEMALE));


            model.addAttribute ("mentors", mentorList);


            return "/mentor/mentor-list";
        }
}
