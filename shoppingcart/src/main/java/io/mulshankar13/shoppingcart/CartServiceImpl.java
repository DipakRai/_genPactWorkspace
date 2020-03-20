package io.mulshankar13.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;

import io.mulshankar13.model.Customer;
import io.mulshankar13.model.Item;

@Service
public class CartServiceImpl {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	public String getProducts() {
		List<Item> items = (List<Item>) itemRepository.findAll();
		Gson gson  = new Gson();
		String itemsJson =gson.toJson(items);
		return itemsJson;
	}
	
	public int getProductsCount() {
		return (int) itemRepository.count();
	}
	

	public String addProduct(String item) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeProduct(String item) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCustomers() {
		List<Customer> customers = customerRepository.findAll();
		Gson gson  = new Gson();
		String customersJson =gson.toJson(customers);
		return customersJson;
	}

}
