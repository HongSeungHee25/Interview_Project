package org.interview.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "html/login";
    }
    @GetMapping("/join")
    public String join() {
        return "html/join";
    }
}
