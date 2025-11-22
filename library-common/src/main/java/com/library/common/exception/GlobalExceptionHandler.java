package com.library.common.exception;

import com.library.common.response.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 *
 * @author: xyh
 * @create: 2023-08-03
 **/
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = BaseException.class)
    public Result handle(BaseException e) {
        if (e.getCode() != null) {
            return Result.error(e.getMessage());
        }
        return Result.error(e.getMessage());
    }

    /**
     * 处理所有接口数据验证异常
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return Result.error(message);
    }

    /**
     * 处理参数校验和自定义参数校验
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    public Result handleValidException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return Result.error(message);
    }
}
