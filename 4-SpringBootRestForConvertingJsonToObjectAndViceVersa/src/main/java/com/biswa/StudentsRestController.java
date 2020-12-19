package com.biswa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class StudentsRestController {

	@GetMapping(value = "/getStudentData")
	public Students getStudentDetails(String studentID) throws JsonProcessingException {

		// it is used for converting object to json
		// ObjectMapper obj=new ObjectMapper();

		// this method used for converting json data to objectS
		// obj.readValue(src, valueType)

		List<Student> slist = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Biswa");
		s1.setStudentSkill("Java");
		slist.add(s1);

		// String sss=obj.writeValueAsString(s1);
		// System.out.println(sss);

		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Biju");
		s2.setStudentSkill("Spring");

		slist.add(s2);

		Students students = new Students();
		students.setStudent(slist);
		return students;
	}

}
