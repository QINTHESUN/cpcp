package com.cp.auth.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (AuthRole)表实体类
 * 
 * @author makejava
 * @since 2024-10-26 09:02:57
 */

@Data
public class AuthRoleDto implements Serializable {

    /**
     * 
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色唯一标识
     */
    private String roleKey;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}

