package com.suj.skillsjava.repos;

import com.suj.skillsjava.beans.StudentBeans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepository extends JpaRepository<StudentBeans, Integer> {
}
