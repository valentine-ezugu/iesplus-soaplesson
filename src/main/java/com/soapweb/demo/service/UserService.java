package com.soapweb.demo.service;


import com.soapweb.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String , User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User james  = new User();
        james.setName("james");
        james.setSalary(23233);
        james.setEmpId(2);

        User val  = new User();
        val.setName("val");
        val.setSalary(44445);
        val.setEmpId(1);

        User yura  = new User();
        yura.setName("yura");
        yura.setSalary(23233);
        yura.setEmpId(3);

        users.put(james.getName(), james);
        users.put(yura.getName(), yura );
        users.put(val.getName(), val);

    }

    public User getUser(String name){
        return users.get(name);
    }
}
