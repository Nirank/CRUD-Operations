package com.example.SQL_Rocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String createUser(User user){
        userRepository.save(user);

        return "User added SuccessFully";
    }

    public User getUser(int id){
       User user =  userRepository.findById(id).get();
        return user;
    }
}

