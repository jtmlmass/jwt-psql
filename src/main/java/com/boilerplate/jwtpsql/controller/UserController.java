package com.boilerplate.jwtpsql.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@RequestMapping("/user")
public class UserController {
    /**
     * GET Endpoint for /api/user to return all users
     */
    @RequestMapping(method = RequestMethod.GET, path = "")
    public String getAllUsers() {
        log.info("ENTRY :: UserController.getAllUsers()");
        log.info("EXIT :: UserController.getAllUsers()");
        return "All Users";
    }
}
