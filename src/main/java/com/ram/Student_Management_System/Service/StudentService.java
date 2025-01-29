package com.ram.Student_Management_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.Student_Management_System.DAO.StudentDao;
import com.ram.Student_Management_System.Enitity.Student;

@Service
public class StudentService 
{
	@Autowired
	StudentDao sado;
	
	public Student saveStudent(Student s)
	{
		return sado.saveStudent(s);
	}
	
	public List<Student> fetchAll()
	{
		return sado.fetchAll();
		
	}
	
	public Student findById(int id)
	{
		return sado.fetchById(id);
	}
	
	public String deleteStudent(int id)
	{
		sado.deleteStudent(id);
		return "Data Deleted...";
	}
	
	public Student updateStudent(Student s)
	{
		return sado.saveStudent(s);
	}
	
	public Student addStudent(Student s)
	{
		return sado.saveStudent(s);
	}
	

}
