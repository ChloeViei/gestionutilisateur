package com.chloevie.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chloevie.api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
