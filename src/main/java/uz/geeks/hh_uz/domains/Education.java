package uz.geeks.hh_uz.domains;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Education {
    private String universityName;
    private String department;
    private String faculty;
    private Integer graduationYear;
    private Level degree;

    enum Level{
        Bachelor,
        PhD,
        Higher,
        Secondary
    }

}
