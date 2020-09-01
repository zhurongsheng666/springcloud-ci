package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Rosh
 * @Date: 2020/8/15 20:55
 */
@RestController
public class StudentController {


    @GetMapping("/index")
    public String index() {
        return "this is student server";
    }


}
