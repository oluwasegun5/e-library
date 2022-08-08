package com.freestar.elibrary.services;

import com.freestar.elibrary.dtos.UserRequest;
import com.freestar.elibrary.models.User;
import com.freestar.elibrary.models.enums.AccountStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public UserRequest createAccount(UserRequest userRequest) {
        User user = User.builder()
                .userName(userRequest.getUserName())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .accountStatus(AccountStatus.valueOf("NORMAL"))
                .build();
        return null;
    }
}
