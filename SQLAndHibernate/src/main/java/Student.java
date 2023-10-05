import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Students")
public class Student {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
private String name;
private int age;
@Column (name = "registration_date", columnDefinition = "DATETIME", nullable = false)
private LocalDateTime registrationDate;


}
