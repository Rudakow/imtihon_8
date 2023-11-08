package uz.najottalim.imtihon_8.entitis;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String SurName;
    Integer age;
    String number;

    @ManyToOne
    Group group;

}
