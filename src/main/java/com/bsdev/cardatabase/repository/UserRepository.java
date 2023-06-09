package com.bsdev.cardatabase.repository;

import com.bsdev.cardatabase.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository  extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
