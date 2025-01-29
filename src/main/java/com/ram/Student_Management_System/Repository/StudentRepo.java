package com.ram.Student_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.Student_Management_System.Enitity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{

}
