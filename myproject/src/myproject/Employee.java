package myproject;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor


public class Employee {
	
	private int employeeID;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	
}
