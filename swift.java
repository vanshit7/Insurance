import java.util.*;
public class swift extends fourWheeler {
	protected String nameOfModel;
	protected int flag;
	public swift(String ownerName,String expiryDate,int policyNumber)
	{
		// vasnhit --> object of policy class
		nameOfModel = "swift";
		this.ownerName = ownerName;
		this.expiryDate = expiryDate;
		this.policyNumber = policyNumber;
		flag = 0;
		// vanshit --> function in policy class to decide whether or not pulsar 
		// is expired and give the boolean output into flag 
	}
	void printDetails()
	{
		System.out.print(nameOfModel+ "  " +ownerName+"  "+noOfWheels+"  "+policyClass+"  "+expiryDate);
	}
}
