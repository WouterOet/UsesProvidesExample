package a;

import api.Api;

import java.util.ServiceLoader;

public class User {

	public static void main(String[] args) {
		Api api = ServiceLoader.load(Api.class).findFirst().get();
		api.greet();
	}
}
