package com.jfsk.testplatform.dto.respone;

public class StatusCode {
    public static final int OK=2000;//成功
    public static final int ERROR=5000;//失败
    public static final int LIGINERROR=5001;//用户名或密码错误
    public static final int ACCESSERROR=5002;//权限不足
    public static final int REMOTERRO=5003;//远程调用失败
    public static final int REPERROR=5004;//重复操作

}
