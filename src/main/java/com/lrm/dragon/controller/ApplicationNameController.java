package com.lrm.dragon.controller;

import com.lrm.dragon.config.DragonBallConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application-name")
public class ApplicationNameController {
    @Autowired
    private DragonBallConfig ballConfig;

    @GetMapping
    public ResponseEntity<String> getAppName() {
        return ResponseEntity.ok(ballConfig.getAplicationName());
    }
}
