package com.ram.Student_Management_System.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ram.Student_Management_System.Enitity.Student;
import com.ram.Student_Management_System.Repository.StudentRepo;

@Repository
public class StudentDao 
{
	@Autowired
	 StudentRepo srepo;
	
	
	public Student saveStudent(Student s)
	{
		return srepo.save(s);
	}
	
	public Student fetchById(int id)
	{
		Optional<Student> student=srepo.findById(id);
		if(student.isPresent())
		{
			
			return  student.get();
		}
		return null;
	}
	
	public List<Student> fetchAll()
	{
		return srepo.findAll();
	}
	
	public String deleteStudent(int id)
	{
		srepo.deleteById(id);
		return"Data Deleted Successfully";
	}
	
	public Student update(Student s)
	{
		return srepo.save(s);
	}
	
	public Student addStudent(Student s)
	{
		return srepo.save(s);
	}

}	
