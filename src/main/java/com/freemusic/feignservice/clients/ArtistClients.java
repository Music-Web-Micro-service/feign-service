package com.freemusic.feignservice.clients;

import com.freemusic.feignservice.pojos.ArtistDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="musiclibraryservice")
public interface ArtistClients {

    @GetMapping("/search")
    public ResponseEntity<ArtistDto> findById(@RequestParam("artistId") int artistId);


}
