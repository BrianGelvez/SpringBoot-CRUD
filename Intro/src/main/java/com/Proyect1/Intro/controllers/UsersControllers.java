package com.Proyect1.Intro.controllers;
import com.Proyect1.Intro.dao.UsersDao;
import com.Proyect1.Intro.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersControllers {

    @Autowired
    private UsersDao userDao;

    @RequestMapping(value = "users/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Brian");
        user.setLast("Gelvez");
        user.setEmail("brian@gmail.com");
        user.setPhone(35123435321L);
        user.setPassword("asdqwe123");

        return user;
    }

    @RequestMapping(value = "users")
    public List <User>  getUser() {

        return userDao.getUser();
    }

    @DeleteMapping(value = "users/{id}")
    public Void delete(@PathVariable Long id) {
        userDao.delete(id);
        return null;
    }
}
