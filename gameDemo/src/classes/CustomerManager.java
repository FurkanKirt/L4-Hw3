package classes;

import entities.Customer;
import interfaces.CustomerCRUD;

public class CustomerManager extends CustomerCheckManager implements CustomerCRUD{
	
	
	@Override
	public void add(Customer customer) {	
		if (checkPerson(customer)==false) {
			
			return;
		}else {
			System.out.println("Giri� Ba�ar�l�!");
			
		}		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� Silindi!");	
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� G�ncellendi!");
		
	}

}
