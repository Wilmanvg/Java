public class Couple {

	private Person male;
	private Person female;
	
	public Couple(Person male, Person female)
	{
		this.male = male;
		this.female = female;
	}
	
	public Person getMale()
	{
		return male;
	}
	
	public Person getFemale()
	{
		return female;
	}
}
