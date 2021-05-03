package interfaces;

import entities.Customer;

public interface CustomerCRUD {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
