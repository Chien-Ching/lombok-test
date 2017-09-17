package cchsu.lombok.controller;

import cchsu.lombok.dao.UserDaoImpl;
import cchsu.lombok.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cchsu on 2017/9/3.
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserDaoImpl userDaoImpl;

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello, this is rest api about user.";
    }

    @RequestMapping("/all")
    public List<User> fetchAll() {
        return userDaoImpl.fetchAll();
    }
}
