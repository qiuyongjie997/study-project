package com.shanghai.study.service.impl;

import com.shanghai.study.model.User;
import com.shanghai.study.mapper.UserMapper;
import com.shanghai.study.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author system
 * @since 2022-07-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> queryUserInfo() {
        return list();
    }
}
