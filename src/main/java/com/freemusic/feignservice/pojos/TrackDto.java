package com.freemusic.feignservice.pojos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrackDto {
    private Integer trackId;
    private String title;
    private Integer artist_id;
    private Integer duration;
    private int media_id;
    private String track_status;
    private List<AlbumDto> albumDtoList;
    private List<String> artistNames;
}
