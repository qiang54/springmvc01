package com.spring.web;

import com.spring.domain.DemoObj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/24 17:54
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getJson", produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj obj){

        return new DemoObj(obj.getId() , obj.getName() + "-json");
    }

    @RequestMapping(value = "/getXml", produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj obj){

        return new DemoObj(obj.getId() , obj.getName() + "-xml");
    }


}
