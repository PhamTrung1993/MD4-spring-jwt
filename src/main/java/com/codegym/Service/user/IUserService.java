package com.codegym.Service.user;

import com.codegym.Service.IGeneralService;
import com.codegym.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
