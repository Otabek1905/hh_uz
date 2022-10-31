package uz.geeks.hh_uz.dto.user;

import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.Location;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class AuthUserDto extends GenericDto {
    @NotBlank
    private String fullName;
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    @NotBlank
    private Set<String> role;

    //    private List<SocialNetwork> socialNetworks;
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    private Location location;

    private String image_url;
}
