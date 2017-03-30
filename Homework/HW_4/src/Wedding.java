import java.time.*;

public class Wedding {
	
	private LocalDate dateOfWedding;
	private Couple couple;
	private String location;
	
	public Wedding(LocalDate dateOfWedding, Couple couple, String location)
	{
		this.dateOfWedding = dateOfWedding;
		this.couple = couple;
		this.location = location;
	}
	
	public LocalDate getWeddingDate()
	{
		return dateOfWedding;
	}
	
	public Couple getCouple()
	{
		return couple;
	}
	
	public String getLocation()
	{
		return location;
	}

}
