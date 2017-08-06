package cchsu.lombok.dao;

import cchsu.lombok.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cchsu on 2017/8/5.
 */
// TODO make it as a really DAO
public class UserDao {
    private List<User> users = new ArrayList<User>();
    public User getUser(String id) {
        for (User user: users) {
        }
    }
}
