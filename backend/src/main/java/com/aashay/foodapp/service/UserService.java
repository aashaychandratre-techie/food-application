package com.aashay.foodapp.service;

import com.aashay.foodapp.io.UserRequest;
import com.aashay.foodapp.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
