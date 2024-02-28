package com.example.samplespringboot2javagradle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RequiredArgsConstructor
@RestController
public class HelloController {

  @GetMapping
  public String hello() {
    return "hello world!";
  }

}
