package com.docker.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/test")
    public Map<String,Object> getValues(){
        Map<String,Object> data=new HashMap<>();
        data.put("message","Java api is working fine");
        data.put("languages", Arrays.asList("Java","Python","C++"));
        data.put("code_marks",800);
        return data;
    }
}
