package uz.geeks.hh_uz.dto.user;

import lombok.*;
import uz.geeks.hh_uz.domains.SocialNetwork;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.enums.Location;
import uz.geeks.hh_uz.enums.UserType;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AuthUserCreateDto implements Dto {


    private String fullname;

    @NotBlank(message = "username can not be blank")
    private String username;


    private String password;


    private String email;


    private List<SocialNetwork> socialNetworks;


    private Location location;

    private String image_url;

    private UserType type;
}
