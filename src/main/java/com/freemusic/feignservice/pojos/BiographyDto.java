package com.freemusic.feignservice.pojos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BiographyDto {
    private int bio_id;

    private String content;

    private Date created_at;

    private Date updated_at;
}
