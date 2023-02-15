package com.example.SQL_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String createUser(@RequestBody()  User user){
        return userService.createUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") Integer  id){
        return userService.getUser(id);
    }
}


    //H.w
    //1. Write an API to find all the Users in Db. (findAll) : no paramter
    //2. Please read through the general function that jpa interface is providing



