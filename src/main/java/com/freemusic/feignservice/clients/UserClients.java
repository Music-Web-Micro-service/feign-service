package com.freemusic.feignservice.clients;

import com.freemusic.feignservice.pojos.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "userservice")
public interface UserClients {

    @GetMapping("/artists/name/{id}")
    String getArtistNameById(@PathVariable Integer id);
}
