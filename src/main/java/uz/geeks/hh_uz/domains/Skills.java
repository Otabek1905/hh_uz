package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Auditable auditable;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Resume resume;

}
