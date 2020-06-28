package com.zth.coupon.advice;

import com.zth.coupon.annotation.IgnoreResponseAdvice;
import com.zth.coupon.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Date: 2020/6/27 2:25 下午
 *
 * @author 3zZ.
 */
@RestControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {
    /**
     * 判断是否需要对相应进行处理
     *
     * @param methodParameter 当前controller方法的定义
     * @param aClass          http消息转换器
     * @return true则为需要 false不需要
     */
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter,
                            Class<? extends HttpMessageConverter<?>> aClass) {
        // 如果当前方法所在的类标识了 @IgnoreResponseAdvice注解，不需要处理
        if (methodParameter.getDeclaringClass().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )) {
            return false;
        }
        // 如果当前方法所在的类标识了 @IgnoreResponseAdvice注解，不需要处理
        if (methodParameter.getMethod().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )) {
            return false;
        }
        // 对相应进行处理，执行 beforeBodyWrite 方法
        return true;
    }

    /**
     * 在响应返回之前的处理
     *
     * @param o                  返回的对象
     * @param methodParameter    方法参数
     * @param mediaType          mediaType
     * @param aClass             http消息转换类
     * @param serverHttpRequest  请求
     * @param serverHttpResponse 响应
     * @return 返回CommonResponse
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        // 定义最终的返回对象
        CommonResponse<Object> response = new CommonResponse<>(
                0, ""
        );
        // 如果 o 是 null， response 不需要设置 data
        if (null == o) {
            return response;
        } else if (o instanceof CommonResponse) {
            // 如果 o 已经是 CommonResponse，不需要再次处理
            response = (CommonResponse<Object>) o;
        } else { // 否则 把响应对象作为 CommonResponse 的 data 部分
            response.setData(o);
        }
        return response;
    }
}
