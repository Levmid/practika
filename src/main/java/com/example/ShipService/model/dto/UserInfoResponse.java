package com.example.ShipService.model.dto;

import com.example.ShipService.model.dto.UserInfoRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserInfoResponse extends  UserInfoRequest{
    Long id;
}
