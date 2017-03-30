import java.time.*;

public class TestWedding {

	public static void main(String[] args)
	{
		LocalDate maleDOB = LocalDate.of(1997, 6, 16);
		Person man = new Person("Willy", "Garcia" , maleDOB);
		
		LocalDate femaleDOB = LocalDate.of(1996,12,17);
		Person woman = new Person("Natallie", "Logan" ,femaleDOB);
		
		Couple couple = new Couple(man, woman);
		LocalDate dateOfWedding = LocalDate.of(2017, 6, 26);
		
		Wedding wedding1 = new Wedding(dateOfWedding, couple, "Santa Monica Pier");
		
		printWeddingDetails(wedding1);
		
		maleDOB = LocalDate.of(1990, 3, 26);
		man = new Person("Bob", "Ross" , maleDOB);
		
		femaleDOB = LocalDate.of(1992,10,11);
		woman = new Person("Sarah", "Cravitz" ,femaleDOB);
		
		couple = new Couple(man, woman);
		dateOfWedding = LocalDate.of(2017, 8, 22);
		
		Wedding wedding2 = new Wedding(dateOfWedding, couple, "Time Square");
		printWeddingDetails(wedding2);
		
	}

	
	private static void printWeddingDetails(Wedding wedding)
	{
		
		System.out.println("Wedding Details \n");
		System.out.println("Bride: Mrs. " + wedding.getCouple().getFemale().getFirstName() + " " + wedding.getCouple().getFemale().getLastName() + "(" + wedding.getCouple().getFemale().getLocalDate() + ")");
		System.out.println("Groom: Mr. " + wedding.getCouple().getMale().getFirstName() + " " + wedding.getCouple().getMale().getLastName() + "(" + wedding.getCouple().getMale().getLocalDate() + ")\n");
		
		System.out.println("At " + wedding.getLocation());
		System.out.println("On " + wedding.getWeddingDate());
		
		System.out.print("\n\n");
	}
	
}
