package com.example.ShipService.model.controllers;
import com.example.ShipService.model.dto.UserInfoRequest;
import com.example.ShipService.model.dto.UserInfoResponse;
import com.example.ShipService.service.UserService;
import com.example.ShipService.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {
    private final UserServiceImpl userService;

@PostMapping
    public UserInfoResponse createUser(@RequestBody UserInfoRequest request){
        return userService.createUser(request);
    }

    @GetMapping("/{id}")
    public UserInfoResponse getUser(@PathVariable Long id, UserInfoRequest request){
        return userService.getUser(id, request);
    }

    @PutMapping("/{id}")
    public UserInfoResponse updateUser(@PathVariable Long id, @RequestBody UserInfoRequest request){
        return userService.updateUser(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){userService.deleteUser(id);}

    @GetMapping("/all")
    public List<UserInfoResponse> getAllUsers(){
        return userService.getAllUsers();
    }
}