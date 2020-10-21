package com.login.backend.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @GetMapping(path = "/helloWorld")
  public String helloWorld() {
    return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
  }
}
