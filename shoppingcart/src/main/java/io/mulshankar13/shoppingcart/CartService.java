package io.mulshankar13.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.mulshankar13.model.Customer;
import io.mulshankar13.model.Item;

@Service
public class CartService {
	
	static GsonBuilder b = new GsonBuilder();
	static {
		b.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);
	}
	static Gson gson = b.create();
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	public String getItemsInCart() {
		List<Item> items = (List<Item>) itemRepository.findAll();
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
		String customersJson =gson.toJson(customers);
		return customersJson;
	}

	public String getItemsInCustomerCart(String customerId) {
		List<Item> items = (List<Item>) itemRepository.findAll();
		String itemsJson =gson.toJson(items);
		return itemsJson;
	}

}
