package com.freestar.elibrary.services;

import com.freestar.elibrary.dtos.UserRequest;

public interface UserService {
    UserRequest createAccount(UserRequest userRequest);

}
