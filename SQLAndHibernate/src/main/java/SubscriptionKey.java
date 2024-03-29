import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class  SubscriptionKey implements Serializable {
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "course_id")
    private int courseId;

}
