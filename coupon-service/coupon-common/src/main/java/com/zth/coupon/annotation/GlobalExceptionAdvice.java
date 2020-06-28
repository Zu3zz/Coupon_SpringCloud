package com.zth.coupon.annotation;

import com.zth.coupon.exception.CouponException;
import com.zth.coupon.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 3zZ.
 * Date: 2020/6/27
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    /**
     * 对 CouponException 进行统一处理和拦截
     *
     * @param request 请求
     * @param ex      异常
     * @return 自动抛出异常相应处理
     */
    @ExceptionHandler(value = CouponException.class)
    public CommonResponse<String> handlerCouponException(
            HttpServletRequest request, CouponException ex
    ) {
        CommonResponse<String> response = new CommonResponse<>(
                -1, "business error");
        response.setData(ex.getMessage());
        return response;
    }
}
