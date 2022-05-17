package com.Spring.StudentCRUD.Services;

import com.Spring.StudentCRUD.Domain.Student;
import com.Spring.StudentCRUD.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 03-January-2022 at 15:32
 * @Project StudentCRUD
 * Happy Coding..!
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student std) {
        repo.save(std);
    }

    public Student get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
