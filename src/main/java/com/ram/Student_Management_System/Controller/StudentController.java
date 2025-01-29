package com.ram.Student_Management_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ram.Student_Management_System.Enitity.Student;
import com.ram.Student_Management_System.Service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student s)
	{
		return service.saveStudent(s);
	}
	
	@GetMapping("/getall")
	public List<Student> fetchAll()
	{
		return service.fetchAll();
		
	}
	
	@GetMapping("/grtbyid/{id}")
	public Student findById(@PathVariable int id)
	{
		return service.findById(id);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
		return "Data Deleted...";
	}
	
	@PatchMapping("/update")
	public Student updateStudent(@RequestBody Student s)
	{
		return service.saveStudent(s);
	}
	
	@PutMapping("/add")
	public Student addStudent(@RequestBody Student s)
	{
		return service.saveStudent(s);
	}
	

}
