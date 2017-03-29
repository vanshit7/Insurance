import java.util.*;

public class pulsar extends twoWheeler {
	protected String nameOfModel;
	protected int flag;
	public pulsar(String ownerName,String expiryDate,int policyNumber)
	{
		// vasnhit --> object of policy class
		nameOfModel = "pulsar";
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
