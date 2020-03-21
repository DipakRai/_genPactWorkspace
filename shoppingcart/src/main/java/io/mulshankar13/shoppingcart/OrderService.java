package io.mulshankar13.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.mulshankar13.model.CartOrder;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public OrderService() {

	}

	public String getOrdersByCustomerId(long id) {
		// find Customer for Customer Id
		List<CartOrder> cartOrders = orderRepository.findAll();
		Gson gson = new Gson();
		String cartOrdersJson = gson.toJson(cartOrders);
		return cartOrdersJson;
	}

	public String getOpenOrdersByCustId(long customerId) {
		return null;
	}
}
