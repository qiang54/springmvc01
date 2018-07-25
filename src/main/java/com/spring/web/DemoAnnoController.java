package com.spring.web;

import com.spring.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/24 17:27
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url" +request.getRequestURI() +" can access.";
    }

    @RequestMapping(value = "/pathVar/{str}" ,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request){
        return "url" +request.getRequestURI() +" can access；str :" + str;
    }

    @RequestMapping(value = "/requestParam" ,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(int id,HttpServletRequest request){
        return "url" +request.getRequestURI() +" can access；id :" + id;
    }

    @RequestMapping(value = "/obj" ,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passObj(DemoObj obj, HttpServletRequest request){
        return "url" +request.getRequestURI() +" can access；OBj :" + obj.toString();
    }

    @RequestMapping(value = {"/name1","/name2"}  ,produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove( HttpServletRequest request){
        return "url" +request.getRequestURI() +" can access" ;
    }


}
