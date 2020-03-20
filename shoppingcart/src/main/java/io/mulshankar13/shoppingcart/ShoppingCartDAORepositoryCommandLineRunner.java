package io.mulshankar13.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.mulshankar13.model.Customer;
import io.mulshankar13.model.Item;

@Component
public class ShoppingCartDAORepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(ShoppingCartDAORepositoryCommandLineRunner.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("Sammy", "Bangalore");
		customerRepository.save(customer);
		log.info("Customer created successfully...." + customer.getId());
		Customer customer2 = new Customer("Harry", "Bangalore");
		customerRepository.save(customer2);
		log.info("Customer created successfully...." + customer2.getId());

		Item item = new Item("Angles and Demons", 510,51);
		itemRepository.save(item); 
		log.info("itemId" + item.getId());
		Item item2 = new Item("Les Miserables", 601,61);
		itemRepository.save(item2);
		log.info("itemId2:" + item2.getId());
	}

}
