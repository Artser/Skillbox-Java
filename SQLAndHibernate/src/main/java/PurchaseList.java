import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PurchaseList")
public class PurchaseList implements Serializable {
    @EmbeddedId
    private PurchaseKey id;
    @Column(name = "student_name", insertable = false, updatable = false)
    private String studentName;

    @Column(name = "course_name", insertable = false, updatable = false)
    private String courseName;

    private Integer price;

    @Column (name = "subscription_date", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime subscriptionDate;
}
