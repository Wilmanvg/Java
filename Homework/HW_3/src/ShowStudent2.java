import javax.swing.JOptionPane;

public class ShowStudent2 {

	public static void main(String[] args) {
		Student stu2 = new Student();
		JOptionPane.showMessageDialog(null, "ID: " + stu2.getId() + "\nPoints Earned: " + stu2.getPointsEarned() + "\nCredit Hours: " + stu2.getHoursEarned() + "\nGPA: " + stu2.calculateGPA());

	}


}


