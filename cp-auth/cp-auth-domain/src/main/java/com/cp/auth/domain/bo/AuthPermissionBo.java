package com.cp.auth.domain.bo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (AuthPermission)表实体类
 * 
 * @author makejava
 * @since 2024-10-26 09:03:19
 */

@Data
public class AuthPermissionBo implements Serializable {

    /**
     * 
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 权限类型 0菜单 1操作
     */
    private Integer type;

    /**
     * 菜单路由
     */
    private String menuUrl;

    /**
     * 状态 0启用 1禁用
     */
    private Integer status;

    /**
     * 展示状态 0展示 1隐藏
     */
    private Integer show;

    /**
     * 图标
     */
    private String icon;

    /**
     * 权限唯一标识
     */
    private String permissionKey;

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
     * 是否被删除 0为删除 1已删除
     */
    private Integer isDeleted;

}

