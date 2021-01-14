package com.jfsk.testplatform.enums;

import com.jfsk.testplatform.dto.respone.Result;

public class ResultUtil {
    public static Result sucess(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result sucess() {
        return sucess(null);
    }

    public static Result sucess(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMessage(ResultEnum.ERROR.getMsg());
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
