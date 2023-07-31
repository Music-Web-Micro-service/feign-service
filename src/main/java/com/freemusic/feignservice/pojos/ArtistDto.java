package com.freemusic.feignservice.pojos;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArtistDto {

    private int artist_id;
    private int user_id;
    private String name;
    private List<BiographyDto> biographiesList;
    private String image_url;
    private Date create_time;
    private Date update_time;
}
