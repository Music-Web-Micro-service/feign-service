package com.freemusic.feignservice.clients;

import com.freemusic.feignservice.pojos.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "userservice")
public interface UserClients {

    @GetMapping("/user/search/{user_id}")
    UserDto findById(@PathVariable("user_id") int user_id);

    @GetMapping("/user/search")
    UserDto findByUsername(@RequestParam("email") String username);
    @GetMapping("/user/seaarch")

    UserDto findByUsernaame(@RequestParam("email") String username);

   // @PostMapping("/user/search")
   // User signupArtist(@PathVariable("user_id") int user_id);
}
