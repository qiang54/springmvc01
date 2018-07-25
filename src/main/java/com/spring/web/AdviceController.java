package com.spring.web;

import com.spring.domain.DemoObj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/25 14:43
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSometing(@ModelAttribute("msg") String msg, DemoObj obj){

        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute:" + msg);
    }
}
