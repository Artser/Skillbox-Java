import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "subscriptions")

public class Subscription {
    @EmbeddedId
    private SubscriptionKey id;
    @Column (name = "student_id", insertable = false, updatable = false, columnDefinition = "INT UNSIGNED", nullable = false) // INT UNSIGNED
    private Integer studentId;

    @Column (name = "course_id", insertable = false, updatable = false, columnDefinition = "INT UNSIGNED", nullable = false)
    private Integer courseId;

    @Column (name = "subscription_date")
    private Date subscriptionDate;


}
