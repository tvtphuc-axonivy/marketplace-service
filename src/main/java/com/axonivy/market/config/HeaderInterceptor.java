package com.axonivy.market.config;

import com.axonivy.market.exceptions.MissingHeaderException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class HeaderInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!"ivy".equals(request.getHeader("X-Requested-By"))) {
            throw new MissingHeaderException();
        }
        return true;
    }
}
