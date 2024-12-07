package com.books.booksuniverse.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class GreetController {

    // "/gtreet"エンドポイントにGETリクエストを受け付ける
    @GetMapping("/greet")
    public String greet() {
        return "/index.html";
    }
    

}
