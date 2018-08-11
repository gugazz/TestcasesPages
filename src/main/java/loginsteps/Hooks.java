package loginsteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beFore(Scenario sc)
	{
		System.out.println(sc.getId());
		System.out.println(sc.getName());
	}
	
	
	@After
	public  void afTer(Scenario sc)
	{
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
	}


}
