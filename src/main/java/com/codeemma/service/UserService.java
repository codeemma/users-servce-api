package com.codeemma.service;

import com.codeemma.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by emmanuel on 10/29/17.
 */
public interface UserService extends UserDetailsService{
    User saveUser(User user);
}
