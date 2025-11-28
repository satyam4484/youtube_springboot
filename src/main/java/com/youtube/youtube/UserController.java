package com.youtube.youtube;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.youtube.entity.User;
import com.youtube.youtube.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<Long> getUsers() {
        Long user = userService.getUserDetails();
        return ResponseEntity.ok(user);
    }
    // main user list --> iterate -> count 
}
