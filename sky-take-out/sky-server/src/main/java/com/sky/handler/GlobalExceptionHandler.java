package com.sky.handler;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/7 9:13
 */

import com.sky.exception.BaseException;
import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器，处理项目中抛出的业务异常

 全局统一异常处理 + 全局数据绑定 + 全局数据预处理，并且所有返回值自动转为 JSON。

 配合 @ExceptionHandler，整个项目所有 Controller 抛异常都在这里统一捕获
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }

}
