package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLUsersDao implements Users{

    @Override
    public User findByUsername(String username) {
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT id FROM users WHERE id = ("' + username + '")";

        } catch (SQLException e) {
            throw new RuntimeException("Error finding user", e);
        }
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
