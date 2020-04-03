package com.example.springsecuritydatajpa.service;

import com.example.springsecuritydatajpa.dao.HelloUserDetailsDAO;
import com.example.springsecuritydatajpa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloUserDetailsService implements UserDetailsService {
    @Autowired
    HelloUserDetailsDAO helloUserDetailsDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Users> user= helloUserDetailsDAO.findByUsername(username);
        user.orElseThrow(()->new UsernameNotFoundException("Not Found" +username));
        return  user.map(HelloUserDetails::new).get();
    }
}
