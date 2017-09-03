package cchsu.lombok.dao;

import cchsu.lombok.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cchsu on 2017/8/5.
 */
// TODO make it as a really DAO
@Repository
public class UserDao {
    private List<User> users = new ArrayList<User>();

    public List<User> fetchAll() {
        User user1 = new User();
        user1.setName("user1");
        user1.setId("user1");

        users.add(user1);

        return users;
    }
}
