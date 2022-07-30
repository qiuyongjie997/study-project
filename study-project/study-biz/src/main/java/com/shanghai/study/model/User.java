package com.shanghai.study.model;

import com.shanghai.study.model.common.NewBaseModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author system
 * @since 2022-07-19
 */
@TableName(value ="t_user")
@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User {


    /**
     * 用户账号
     */
    @TableField("user_account")
    private String userAccount;

    /**
     * 用户密码 MD5
     */
    @TableField("password")
    private String password;

    /**
     * 用户编号
     */
    @TableField("user_no")
    private String userNo;

    /**
     * 用户编号
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户状态
     */
    @TableField("user_status")
    private Integer userStatus;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 流程状态(0:冻结,1:启用,2:审批中,3:审批退回,4:编辑中)
     */
    @TableField("process_status")
    private Integer processStatus;


    /**
     * 证件号
     */
    @TableField("certificate_no")
    private String certificateNo;


}
