package com.freestar.elibrary.dtos;

import com.freestar.elibrary.models.enums.AccountStatus;
import com.freestar.elibrary.models.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequest {
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Gender gender;
    private LocalDateTime dob;
    private AccountStatus accountStatus;
    private LocalDateTime dateJoined;
}
