package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @author：ZhouYao
 @create：2021-12-28 20:21
 */

@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {

        return person;
    }


}
