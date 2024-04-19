package com.github.uwa9k073.docker_maven;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v1/hello")
public class HelloController {
  @GetMapping("/greetings")
  public ResponseEntity<?> handleGreetings(@RequestParam String name){
    return ResponseEntity.ok(String.format("Hello, %s", name));
  }
}
