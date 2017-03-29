package policy;

public class packagePolicy extends Policy{
		public packagePolicy()
		{
			selfSettle=0.5;
			thirdSettle=0.8;
		}
		
		public void func(int selfDamage,int oncomingDamage)
		{
			selfSettle *= selfDamage; 
			thirdSettle *= oncomingDamage;
		}
}
