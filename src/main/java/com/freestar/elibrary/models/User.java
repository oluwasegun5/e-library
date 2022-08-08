package com.freestar.elibrary.models;

import com.freestar.elibrary.models.enums.AccountStatus;
import com.freestar.elibrary.models.enums.Gender;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Document("users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id_sequence")
    private String id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String userName;
    @NonNull @Email
    private String email;
    @NonNull
    private String password;
    private Gender gender;
    private LocalDateTime dob;
    private LocalDateTime dateJoined;
    private AccountStatus accountStatus;
}
