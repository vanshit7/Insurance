package policy;

public class thirdParty extends Policy{
		public packagePolicy()
		{
			selfSettle=0;
			thirdSettle=0.8;
		}
		
		public void func(int oncomingDamage)
		{
			thirdSettle *= oncomingDamage;
		}
}
