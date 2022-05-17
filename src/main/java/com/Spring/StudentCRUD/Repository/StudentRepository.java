package com.Spring.StudentCRUD.Repository;

import com.Spring.StudentCRUD.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 03-January-2022 at 15:58
 * @Project StudentCRUD
 * Happy Coding..!
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
