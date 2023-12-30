package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHooks {

	@Before(order=1)
	public void beforeSnapping() {
		System.out.println("thanos collecting the infinity stones");
	}
	
	@After(order=1)
    public void afterSnapping() {
		System.out.println("after killing everyone taking rest on garden ");
	}
	
	@Before(order=0)
	public void beforeCollecting() {
		System.out.println("thanos has to be born");
	}
	
	@After(order=0)
    public void afterKilling() {
		System.out.println("finally thanos is also dying");
	}
	
}
