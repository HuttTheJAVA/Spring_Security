package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        System.out.println("\n\n\n\n1   qw312314r124109u3524 09 email:"+email);
        System.out.println(userRepository.findByEmail(email));
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }
}