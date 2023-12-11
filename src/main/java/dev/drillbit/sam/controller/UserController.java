package dev.drillbit.sam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/all")
    public List<String> allUsers() {

        List<String> users = new ArrayList<>();
        users.add("sammed");
        users.add("Amit");
        users.add("shreyank");
        users.add("shub");
        return users;
    }
}
