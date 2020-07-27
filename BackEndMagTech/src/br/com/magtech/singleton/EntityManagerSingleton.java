
package br.com.magtech.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

	private static EntityManagerFactory instance;
	
	private EntityManagerSingleton() {}
	
	public static EntityManagerFactory getInstance() {
		if(instance == null) {
			instance = Persistence.createEntityManagerFactory("oracle");
		}
		return instance;
	}	
}
