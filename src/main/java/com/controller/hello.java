package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class hello {
    @ResponseBody
    @RequestMapping("/hello")
    public Map hello(){
        Map map=new HashMap();
        map.put(123,"scds");
        return map ;
    }
}
