package com.example.instagram_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hello, World! 수정 - CI/CD 자동화 최종 테스트 좋아요";
    }
}
