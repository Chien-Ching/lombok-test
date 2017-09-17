package cchsu.lombok.dao;

import cchsu.lombok.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cchsu on 2017/9/17.
 */
public interface UserDao extends CrudRepository<User, String> {
}
