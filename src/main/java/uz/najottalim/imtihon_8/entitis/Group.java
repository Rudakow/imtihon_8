package uz.najottalim.imtihon_8.entitis;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String subject;
    Date Start;
    Date Finish;

    @OneToMany
    Set<Student> students;
    @OneToMany
    Set<Teacher> teachers;
}
