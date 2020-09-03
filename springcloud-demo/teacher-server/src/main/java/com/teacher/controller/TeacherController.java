package com.teacher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Rosh
 * @Date: 2020/8/15 20:52
 */
@RestController
public class TeacherController {

    @GetMapping("/index")
    public String index() {
        return "this is teacher server ,Hello World";
    }

}

