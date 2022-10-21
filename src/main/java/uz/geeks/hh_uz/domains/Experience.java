package uz.geeks.hh_uz.domains;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Experience {
    private String organization;
    private String region;
    private String website;
    private String position;
    private String description;
}
