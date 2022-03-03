package com.fmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping("/user")
    public String user () {
        return "/user/userinfo.html"; //got o folder "static" and look over there
    }
}
