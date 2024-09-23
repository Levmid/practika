package com.example.ShipService.service;

import com.example.ShipService.model.dto.UserInfoRequest;
import com.example.ShipService.model.dto.UserInfoResponse;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    UserInfoResponse createUser(UserInfoRequest request);

    UserInfoResponse getUser(Long id, UserInfoRequest request);

    UserInfoResponse updateUser(Long id, UserInfoRequest request);

    void deleteUser(Long id);

    List<UserInfoResponse> getAllUsers();
}
