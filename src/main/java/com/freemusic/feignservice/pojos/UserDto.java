package com.freemusic.feignservice.pojos;

//import com.freemusic.userservice.entity.User;
//import com.freemusic.userservice.entity.User_role;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private int user_id;

    private List<User_roleDto> roleList;
    private String email;
    private String userName;
    private String password;
    private byte sex;
    private int phone_number;
    private Date birth;
    private String location;
    private String avatar;

//    public UserDto(User user) {
//        this.user_id = user.getUser_id();
//        this.roleList = user.getUser_roleList().stream()
//                .map(User_roleDto::new)
//                .collect(Collectors.toList());
//        this.email = user.getEmail();
//        this.userName = user.getUserName();
//        this.sex = user.getSex();
//        this.phone_number = user.getPhone_number();
//        this.birth = user.getBirth();
//        this.location = user.getLocation();
//        this.avatar = user.getAvatar();
//    }

}
