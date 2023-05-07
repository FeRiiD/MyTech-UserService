package com.MyTech.user;

import kafka.utils.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository userRepository) {

    public void registerUser(UserRegistrationRequest request){

        BCryptPasswordEncoder pwd = new BCryptPasswordEncoder();
        User user = User.builder()
                .user_name(request.userName())
                .password(pwd.encode(request.password()))
                .build();

        userRepository.save(user);
    }

}
