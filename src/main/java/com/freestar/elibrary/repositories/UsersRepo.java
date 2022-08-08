package com.freestar.elibrary.repositories;

import com.freestar.elibrary.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepo extends MongoRepository<User, String> {

}
