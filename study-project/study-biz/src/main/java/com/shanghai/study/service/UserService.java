package com.shanghai.study.service;

import com.shanghai.study.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author system
 * @since 2022-07-19
 */
public interface UserService extends IService<User> {

    /**@author: qyj 查询所有用户信息
     *@return:
     */
    List<User> queryUserInfo();

}
