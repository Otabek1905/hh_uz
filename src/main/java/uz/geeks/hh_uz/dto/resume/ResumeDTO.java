package uz.geeks.hh_uz.dto.resume;

import lombok.*;
import uz.geeks.hh_uz.domains.*;
import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.City;
import uz.geeks.hh_uz.enums.Employment;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ResumeDTO extends GenericDto {

    private String fullName;

    private String phoneNumber;

    private String email;

    private City city;

    private String jobTitle;

    private Employment employment;

    private String aboutMe;

    private Double salary;

    private List<Education> educations;

    private List<Language> languages;

    private List<Experience> experiences;

    private List<Skills> skills;


}
