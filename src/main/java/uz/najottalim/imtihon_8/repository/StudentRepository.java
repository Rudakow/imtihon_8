package uz.najottalim.imtihon_8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najottalim.imtihon_8.entitis.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
