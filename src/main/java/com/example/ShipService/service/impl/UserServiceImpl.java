package com.example.ShipService.service.impl;

import com.example.ShipService.model.dto.UserInfoRequest;
import com.example.ShipService.model.dto.UserInfoResponse;
import com.example.ShipService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j

public class UserServiceImpl implements UserService {
    //Создание списка пользователей
    private List<UserInfoResponse> users = new ArrayList<>();

    @Override
    public UserInfoResponse createUser(UserInfoRequest request){

        Long n = (long)(Math.random() * 100 + 1);

        UserInfoResponse user =  UserInfoResponse.builder()
                .id(n)
                .email(request.getEmail())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .age(request.getAge())
                .gender(request.getGender())
                .build();
        // Дополняем список новым пользователем
        users.add(user);
        return user;

    }
    @Override
    public UserInfoResponse getUser(Long id, UserInfoRequest request){
        UserInfoResponse userInfoResponse = UserInfoResponse.builder()
                .id(1L)
                .email(request.getEmail())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .age(request.getAge())
                .gender(request.getGender())
                .build();
        for(UserInfoResponse user : users){
            if (Objects.equals(id, user.getId())){
                userInfoResponse = user;
            }
        }
        return userInfoResponse;
    }

    @Override
    public UserInfoResponse updateUser(Long id, UserInfoRequest request){return null;}

    @Override
    public void deleteUser(Long id){}

    @Override
    public List<UserInfoResponse> getAllUsers(){return users;}
}
