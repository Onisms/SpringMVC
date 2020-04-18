package com.galaxy.web.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SecondInterceptor implements HandlerInterceptor {
    @Override
    /*
     * 该方法会在控制器方法前执行，其返回值表示是否终端后续操作当其返回值为true
     * 表示继续向下执行：当其返回值为false时，会中断后续的所有操作
     * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //true 放行; false
        System.out.println("1 222preHandle 方法，控制器方法执行之前。。。。。");
        return true;
    }

    @Override
    /*
     * 该方法会在控制器方法调用之后，其解析视图之前执行，
     * 可以通过此方法对请求中的模型和视图做出近一步的修改
     * */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("2 22postHandle 方法，控制器方法执行之后执行,在视图渲染之前。。。。。");

    }

    @Override
    /*
     * 该方法会在整个请求完成，记视图渲染结束之后执行，
     * 可以通过此方法实现一些次元清理、记录日志信息等工作*/
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("4 222afterCompletion 方法，在所有工作完成之后执行，关闭资源等操作。。。。");

    }
}
