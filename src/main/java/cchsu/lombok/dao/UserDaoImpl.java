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
public class UserDaoImpl implements UserDao {
    private List<User> users = new ArrayList<User>();

    public List<User> fetchAll() {
        User user1 = new User();
        user1.setName("user1");
        user1.setId("user1");

        users.add(user1);

        return users;
    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public User findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAll(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void delete(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
