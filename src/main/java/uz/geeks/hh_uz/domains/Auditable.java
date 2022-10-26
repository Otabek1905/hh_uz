package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
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
//    @Builder.Default
//    private Long createdBy = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt",
            columnDefinition = "timestamp NOT NULL default CURRENT_TIMESTAMP")
    private Date createdAt;
    private Long updatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted", columnDefinition = "BOOLEAN NOT NULL default false")
    private Boolean deleted;
}
