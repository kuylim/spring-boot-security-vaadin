/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.springbootvaadin.services;

import com.wordpress.kuylim.springbootvaadin.entities.Role;
import com.wordpress.kuylim.springbootvaadin.entities.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author KUYLIM
 */
@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        List<Role> roles = new ArrayList<>();
        if(username.equals("user"))
        {
            Role role = new Role();
            user.setUsername("user");
            user.setPassword("123");
            role.setName("ROLE_ADMIN");
            roles.add(role);
            user.setRoles(roles);
        }
        return user;
    }
    
}
