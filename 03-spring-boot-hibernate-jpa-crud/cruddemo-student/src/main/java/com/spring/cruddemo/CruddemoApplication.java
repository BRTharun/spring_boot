package com.spring.cruddemo;

import com.spring.cruddemo.dao.StudentDAO;
import com.spring.cruddemo.entity.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);

			//readStudent(studentDAO);
			//findAllStudents(studentDAO);

			//findByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteAStudent(studentDAO);

			delateAllStudents(studentDAO);
		};
	}

	private void delateAllStudents(StudentDAO studentDAO) {
		System.out.println("deleting all rows");
		int theRows=studentDAO.deleteAll();
		System.out.println("the deleted rows are "+theRows);
	}

	private void deleteAStudent(StudentDAO studentDAO) {
		int theId=4;
		Student theStudent = studentDAO.findById(theId);
		System.out.println("deleting the user"+theStudent);
		studentDAO.delete(theId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int theId=1;
		Student theStudent=studentDAO.findById(theId);
		System.out.println("the updating student is "+theStudent);
		theStudent.setFirstName("jay");
		studentDAO.update(theStudent);
		System.out.println("updated firstname is"+theStudent);
	}

	private void findByLastName(StudentDAO studentDAO) {
		List<Student> theStudents= studentDAO.findByLastName("ram");
		for(Student theStudent:theStudents){
			System.out.println(theStudent);
		}

	}

	private void findAllStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();
		for(Student theStudent:theStudents){
			System.out.println(theStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//create student obj
		System.out.println("Creating student");
		Student tempStudent = new Student("lord","krishna","krishna@123");


		//save student obj
		System.out.println("Saving student object");
		studentDAO.save(tempStudent);

		//printing student id
		int myId=tempStudent.getId();
		System.out.println("Generated student id "+myId);

		//retrieve data from id
		Student myStudent=studentDAO.findById(myId);
		System.out.println("Printing student retrieved data"+myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating student");
		Student tempStudent1 = new Student("loard","sita","sita@123");
		Student tempStudent2 = new Student("lord","laxman","laxman@123");
		Student tempStudent3 = new Student("lord","bharat","bharat@123");

		System.out.println("Saving student object");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create student obj
		System.out.println("Creating student");
		Student tempStudent = new Student("lord","ram","ram@123");


		//save student obj
		System.out.println("Saving student object");
		studentDAO.save(tempStudent);

		//printing student id
		System.out.println("Generated student id "+tempStudent.getId());
	}

}
