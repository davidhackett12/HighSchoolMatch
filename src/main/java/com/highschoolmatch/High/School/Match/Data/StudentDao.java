package com.highschoolmatch.High.School.Match.Data;

import com.highschoolmatch.High.School.Match.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentDao extends CrudRepository<Student, Integer> {
}
