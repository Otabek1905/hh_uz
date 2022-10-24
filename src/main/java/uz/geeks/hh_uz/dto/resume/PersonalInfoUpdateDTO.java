package uz.geeks.hh_uz.dto.resume;

import lombok.*;
import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.City;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalInfoUpdateDTO extends GenericDto {

    @NotBlank(message = "fullName cannot be empty")
    private String fullName;

    @NotBlank(message = "phone number cannot be empty")
    private String phoneNumber;

    @Email(regexp = ".+@.+\\..+")
    private String email;

    @NotBlank(message = "city cannot be empty")
    private City city;


}
