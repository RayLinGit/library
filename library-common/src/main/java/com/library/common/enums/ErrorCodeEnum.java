package com.library.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xyh
 * @create: 2023-09-02
 **/
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    FILE_NONE(0001, "文件为空"),
    USER_STOP(0002, "账号停用"),
    VERIFY_CODE(0003, "验证码不正确"),
    INCORRECT_OLD_PASSWORD(0004, "原密码有误"),
    BORROWING_NUM(0005, "借阅数量超出");

    private int code;
    private String desc;
}
