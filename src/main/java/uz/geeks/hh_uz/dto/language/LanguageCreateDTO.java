package uz.geeks.hh_uz.dto.language;

import lombok.*;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.enums.LanguageDegree;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LanguageCreateDTO implements Dto {

    @NotBlank(message = "language name cannot empty")
    private String name;

    @NotBlank(message = "language type cannot empty")
    private LanguageType languageType;

    @NotBlank(message = "language degree cannot empty")
    private LanguageDegree languageDegree;


}
