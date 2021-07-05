package com.futuregallery.service;

import com.futuregallery.exception.LoginException;
import com.futuregallery.model.User;

import java.util.Map;

public interface UserService {
    User login(String loginName, String loginPwd) throws LoginException;

    Map<String, Object> checkPwd(User user);

    Boolean editPwd(User user);
}
