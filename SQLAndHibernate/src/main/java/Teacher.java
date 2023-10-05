import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "Teachers")
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column (nullable = true)
    private Integer salary;
    private Integer age;

    @Override
    public String toString() {
        return id + " " + name;
    }

}
