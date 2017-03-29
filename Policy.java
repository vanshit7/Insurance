package policy;
import java.util.*;
public class Policy {
	protected double selfSettle;
	protected double thirdSettle;
	protected String policyClass;
	
	public void calc(String selfPolicyClass, int selfDamage, int oncomingDamage)
	{
		thirdParty third = new thirdParty();
		packagePolicy four = new packagePolicy();
		if(selfPolicyClass.equals("package"))
		{
			four.func(selfDamage,oncomingDamage);
			selfSettle = four.selfSettle;
			thirdSettle = four.thirdSettle;
		}
		else
		{
			third.func(oncomingDamage);
			selfSettle = third.selfSettle;
			thirdSettle = third.thirdSettle;
		}
	}
	
}
