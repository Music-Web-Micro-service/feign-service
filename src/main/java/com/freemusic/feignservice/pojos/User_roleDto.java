package com.freemusic.feignservice.pojos;

//import com.freemusic.userservice.entity.User_role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User_roleDto {
    private int user_role_id;
    private int user_id;
    private int role_id;

//    public User_roleDto(User_role userRole) {
//        this.user_role_id = userRole.getUser_role_id();
//        this.user_id = userRole.getUser().getUser_id();
//        this.role_id = userRole.getRole().getRole_id();
//    }
}
