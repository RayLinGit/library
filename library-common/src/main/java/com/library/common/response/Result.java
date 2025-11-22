package com.library.common.response;

import com.library.common.constant.Constants;

import java.io.Serializable;

/**
 * 接口返回类
 *
 * @author: xyh
 * @create: 2023-09-02
 **/
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int success = Constants.SUCCESS;
    /**
     * 失败
     */
    public static final int error = Constants.FAIL;
    /**
     * 状态码
     */
    private int code;
    /**
     * 状态信息,错误描述.
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public static <T> Result<T> success() {
        return result(null, success, "操作成功");
    }

    public static <T> Result<T> success(T data) {
        return result(data, success, "操作成功");
    }

    public static <T> Result<T> success(String msg, T data) {
        return result(data, success, msg);
    }

    public static <T> Result<T> success(String msg) {
        return result(null, success, msg);
    }

    public static <T> Result<T> error() {
        return result(null, error, "操作失败");
    }

    public static <T> Result<T> error(String msg) {
        return result(null, error, msg);
    }

    public static <T> Result<T> error(int code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> error(T data) {
        return result(data, error, "操作失败");
    }

    private static <T> Result<T> result(T data, int code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
