/*Filename ShowStudent.java
 * Written by Wilman Garcia
 * Assignment: HW3
 * Written on 3/07/2017
 */

import javax.swing.JOptionPane;

public class ShowStudent {

	public static void main(String[] args) {
		
		int id; 
		int hours;
		int points;
		float gpa;
		
		Student stu1 = new Student();
		stu1.setId(2611300);
		stu1.setHoursEarned(5);
		stu1.setPointsEarned(10);
		
		id = stu1.getId();
		hours = stu1.getHoursEarned();
		points = stu1.getPointsEarned();
		gpa = stu1.calculateGPA();
		
		JOptionPane.showMessageDialog(null, "ID: " + id + "\nPoints Earned: " + points + "\nCredit Hours: " + hours + "\nGPA: " + gpa);
	}

}

