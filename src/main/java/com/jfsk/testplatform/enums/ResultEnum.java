package com.jfsk.testplatform.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(200,"查询成功"),
    UPDATE_SUCCESS(200,"更新成功"),
    SAVE_SUCCESS(200,"保存成功"),
    DELETED_SUCCES(200,"删除成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXIST(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    WRONG_PASSWORD(4,"密码错误"),
    USER_IS_DELETE(5,"用户已删除"),
    ERROR(1000,"失败"),

    MOBILEPARAM_ERROR(-2,"手机号不能为空"),
    CNIDPARAM_ERROR(-3,"身份证参数为空"),
    PARAM_ERROR(16,"参数错误"),
    SERVER_ERROR(500,"服务器异常");

    private Integer code;
    private String msg;
    ResultEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
