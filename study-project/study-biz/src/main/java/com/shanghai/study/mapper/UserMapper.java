package com.shanghai.study.mapper;

import com.shanghai.study.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author system
 * @since 2022-07-19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
