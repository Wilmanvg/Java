
public class Student {
	
	private int id;
	private int hoursEarned;
	private int pointsEarned;
	
	public Student()
	{
		id = 9999;
		pointsEarned = 12;
		hoursEarned = 3;
	}
	
	public void setId(int value)
	{
		id = value;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setHoursEarned(int value)
	{
		hoursEarned = value;
	}
	
	public int getHoursEarned()
	{
		return hoursEarned;
	}
	
	public void setPointsEarned(int value)
	{
		pointsEarned = value;
	}
	
	public int getPointsEarned()
	{
		return pointsEarned; 
	}
	
	public float calculateGPA()
	{
		float gpa;
		gpa = pointsEarned/hoursEarned;
		return gpa;
	}

}
