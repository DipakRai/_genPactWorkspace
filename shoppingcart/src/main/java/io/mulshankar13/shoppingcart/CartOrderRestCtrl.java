package io.mulshankar13.shoppingcart;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.mulshankar13.model.Item;

/**
 * Rest End points for order related services
 * 
 * @author mulshankar13
 *
 */
@RestController
public class CartOrderRestCtrl {

	private static final Logger logger = LoggerFactory.getLogger(CartOrderRestCtrl.class);

	static GsonBuilder b = new GsonBuilder();
	static {
		b.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);
	}
	static Gson gson = b.create();

	@Autowired
	private OrderService orderService;

	@Autowired
	private ItemServiceImpl itemService;

	public CartOrderRestCtrl() {

	}

	@GetMapping(path = "/orders", params = "orderId") // Using RequestParam
	public String findAllItemsByOrderId(@RequestParam String orderId) {
		System.out.println("!@#!@#@! findAllItemsByOrderId..... ");
		logger.info("@@#@#$ orderId:" + orderId);
		List<Item> items = itemService.findAllItemsByOrderId(Long.parseLong(orderId));
		String itemsJson = gson.toJson(items);
		return itemsJson;
	}

	@GetMapping(path = "/orders/open/{customerId}") // Using PathVariable
	public String getOpenOrdersByCustId(@PathVariable("customerId") long customerId) {
		logger.info(" @#@@# customerId " + customerId);
		String ordersJson = orderService.getOpenOrdersByCustId(customerId);
		return ordersJson;
	}

}
