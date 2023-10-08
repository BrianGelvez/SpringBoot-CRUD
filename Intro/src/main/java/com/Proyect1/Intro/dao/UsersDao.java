package com.Proyect1.Intro.dao;

import com.Proyect1.Intro.models.User;

import java.util.List;

public interface UsersDao {
    List<User> getUser();

    void delete(Long id);
}
