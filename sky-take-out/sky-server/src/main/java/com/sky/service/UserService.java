package com.sky.service;


import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/9 8:20
 */

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
