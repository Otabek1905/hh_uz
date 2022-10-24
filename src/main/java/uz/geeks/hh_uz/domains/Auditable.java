package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 16:33 (Friday)
 * hh_uz/IntelliJ IDEA
 */
@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Auditable {
    @Column(nullable = false, unique = true)
    private Long createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", nullable = false,
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDate createdAt;
    @Column(nullable = false, unique = true)
    private Long updatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedAt", nullable = false,
            columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDate updatedAt;
}
