package com.futuregallery.service;

import com.futuregallery.exception.LoginException;
import com.futuregallery.model.User;

public interface UserService {
    User login(String loginName, String loginPwd) throws LoginException;
}
