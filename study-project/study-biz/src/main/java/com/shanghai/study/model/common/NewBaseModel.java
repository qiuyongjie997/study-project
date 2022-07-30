package com.shanghai.study.model.common;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;


/**
 * 公用model
 *
 * @author admin
 * @date 2021/9/24 18:20
 */
@Data
public class NewBaseModel {

    /** 实体的标识*/
	@TableId(value = "Id", type = IdType.ASSIGN_ID)
    private Long id;

	/** 删除标记 1表示已删除*/
	@TableField(fill = FieldFill.INSERT)
	private Integer isDeleted;
    /** 创建人ID*/
	@TableField(fill = FieldFill.INSERT)
    private String creatorId;
	/** 创建时间*/
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	/** 修改人id*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updaterId;
	/** 修改时间*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
}
