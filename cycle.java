
public class cycle extends vehicle {
	protected String nameOfModel;
	protected int flag;
	public cycle(String ownerName)
	{
		noOfWheels = 2;
		nameOfModel="hero";
		this.ownerName=ownerName;
		flag = 0;
	}
	void printDetails()
	{
		System.out.print(nameOfModel+ "  " +ownerName+"  "+noOfWheels+" --"+" --");
	}
}
