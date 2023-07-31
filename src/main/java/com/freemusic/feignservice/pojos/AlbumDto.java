package com.freemusic.feignservice.pojos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlbumDto {
    private Integer albumId;
    private String title;
    private Integer artistId;
    private Date releaseDate;
    private String imageUrl;
}
