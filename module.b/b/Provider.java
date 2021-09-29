package b;

import api.Api;

public class Provider implements Api {

	@Override
	public void greet() {
		System.out.println("Hello World");
	}
}
