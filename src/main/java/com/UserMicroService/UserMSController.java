package com.UserMicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserMSController {

    @Autowired
    private UserMSRepository userMSRepository;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void getUserDetails(@RequestBody User userDetails) {

        userMSRepository.save(userDetails);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello from User Microservice";
    }

}
