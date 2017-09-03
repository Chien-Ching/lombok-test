package cchsu.lombok.dao;


import cchsu.lombok.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cchsu on 2017/9/3.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;


    @Test
    public void prepare() {
        List<User> users = userDao.fetchAll();

        assertEquals("user1", users.get(0).getName());

//        User user2 = new User();
//        user1.setName("user2");
//        user1.setId("user2");
    }

}
