package io.mulshankar13.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.mulshankar13.model.CartOrder;

@Service
public class OrderService {

	static GsonBuilder b = new GsonBuilder();
	static {
		b.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);
	}
	static Gson gson = b.create();
	@Autowired
	private OrderRepository orderRepository;

	public OrderService() {

	}

	public String getOrdersByCustomerId(long id) {
		// find Customer for Customer Id
		List<CartOrder> cartOrders = orderRepository.findAll();
		System.out.println(" cartOrders received =" + cartOrders);
		//Gson gson = new Gson();
		String json = gson.toJson(cartOrders);
		return json;
	}

	public String getOpenOrdersByCustId(long customerId) {
		// orderRepository.findAll(example)
		return null;
	}
}
