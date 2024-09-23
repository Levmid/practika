package com.example.ShipService.model.dto;

import com.example.ShipService.model.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserInfoRequest {
    String email;
    String password;
    String firstName;
    String lastName;
    Integer age;
    Gender gender;

}

