package myproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data


public class Student {
	
	private int studentID;
	private String studentName;
	private String studentcourse;

}
