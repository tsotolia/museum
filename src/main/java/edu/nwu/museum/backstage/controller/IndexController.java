package edu.nwu.museum.backstage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/admin")
public class IndexController {
  @RequestMapping("/index")
  public String index() {
    return "index page";
  }
}