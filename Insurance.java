package policy;
import java.util.*;

public class Insurance {

	public int self;
	public int oncoming;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pulsar p1 = new pulsar("sourav","15/07/2015",1);
		pulsar p2 = new pulsar("vanshit","12/09/2017",2);
		swift s1 = new swift("krishan","1/05/2014",3);
		swift s2 = new swift("nikhil","23/09/2016");
		cycle c1 = new cycle();
		cycle c2 = new cycle();
		System.out.print("Model "+"owner name "+"number of wheels "+"policy class "+"policy expiry ");
		p1.printDetails();
		p2.printDetails();
		s1.printDetails();
		s2.printDetails();
		c1.printDetails();
		c2.printDetails();
		Policy check = new Policy();
		vehicle[] oo = new vehicle(6);
		oo[0] = p1;
		oo[1] = p2;
		oo[2] = s1;
		oo[3] = s2;
		oo[4] = c1;
		oo[5] = c2;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(i!=j)
				{
					System.out.println("I am "+oo[j].nameOfModel+" ,"+oo[j].ownerName+", collided with "+oo[i].nameOfModel+" ,"+oo[i].ownerName);
					System.out.println("Enter self damage");
					self = scan.nextInt();
					System.out.println("Enter oncoming damage");
					oncoming = scan.nextInt();
					System.out.println("System details");
					if(oo[j].flag)
					{
						check.calc(oo[j].policyClass,self,oncoming);
						System.out.println("self settle: ",check.selfSettle);
						System.out.println("oncoming settle: ",check.thirdSettle);
					}
				}
			}
		}
		

	}

}
