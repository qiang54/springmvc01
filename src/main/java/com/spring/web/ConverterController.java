package com.spring.web;

import com.spring.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/25 17:29
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = "application/x-qiang;charset=UTF-8")
    public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
        return obj;
    }
}
