import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table (name = "linkedpurchaselist")
public class LinkedPurchaseList implements Serializable {

    @EmbeddedId
    private LinkedPurchaseKey id;

    @Column (name = "student_id", insertable = false, updatable = false )
    private Integer studentId;

    @Column (name = "course_id",insertable = false, updatable = false )
    private Integer courseId;
}
