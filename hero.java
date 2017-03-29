import java.util.*;

public class hero extends cycle {
	protected String nameOfModel;
	public hero(String ownerName)
	{
		nameOfModel = "hero";
		this.ownerName = ownerName; 
	}
	void printDetails()
	{
		System.out.print(nameOfModel+ "  " +ownerName+"  "+noOfWheels+"  --  --");
	}
}
