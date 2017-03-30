/*Filename MinutesConversion.java
 * Written by Wilman Garcia
 * Assignment: HW2
 * Written on 2/26/2017
 */

import javax.swing.JOptionPane;


public class MinutersConversion {

	public static void main(String[] args) {
		
		final int NUM_MIN_IN_HOUR = 60;
		final int NUM_HOURS_IN_DAY = 24;
		String stringMinutes;
		double minutes;
		double hours;
		double days;
		
		stringMinutes = JOptionPane.showInputDialog(null, "Enter a number of minutes to be converted", "Minutes", JOptionPane.QUESTION_MESSAGE);		
		minutes = Double.parseDouble(stringMinutes);
		hours = minutes / NUM_MIN_IN_HOUR;
		days = hours / NUM_HOURS_IN_DAY;
		
		JOptionPane.showMessageDialog(null, minutes + " minutes is equal to \n" + hours + " hours \n" + days + " days");
		

	}

}
