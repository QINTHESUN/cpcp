package com.cp.auth.common.enums;

import lombok.Getter;

/**
 * @Author: q
 * @Description: TODO
 * @DateTime: 3/9/2024 下午 9:50
 *
 * 删除状态，枚举
 **/
@Getter
public enum IsDeletedFlagEnum {

    DELETED(1,"已删除"),
    UN_DELETED(0,"未删除");



    public int code;

    public String desc;

    IsDeletedFlagEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }


    public static IsDeletedFlagEnum getByCode(int codeVal){
        for (IsDeletedFlagEnum resultCodeEnum : IsDeletedFlagEnum.values()){
            if (resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }
        }
        return null;
    }

}
