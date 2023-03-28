package com.MyTech.user;

import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository userRepository) {
    public void registerUser(UserRegistrationRequest request){
        User user = User.builder()
                .userName(request.userName())
                .password(request.password())
                .build();

        // TODO: Check if username valid
        // TODO: Check if password valid
        userRepository.save(user);
    }
}
