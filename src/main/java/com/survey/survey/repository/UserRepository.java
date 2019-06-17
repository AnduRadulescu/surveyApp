package com.survey.survey.repository;

import com.survey.survey.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author alexa on 6/17/2019.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserNameAndPassword(String username, String password);
}
