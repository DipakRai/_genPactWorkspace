package io.mulshankar13.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest End points for order related services
 * 
 * @author mulshankar13
 *
 */
@RestController("/order")
public class CartOrderCtrl {

	private static final Logger logger = LoggerFactory.getLogger(CartOrderCtrl.class);
	
	@Autowired
	private OrderService orderService;

	public CartOrderCtrl() {

	}

	@GetMapping(path = "/orders", params = "customerId")
	public String getOrdersByCustomerId(@RequestParam String customerId) {
		logger.info(" customerId:"+customerId);
		String ordersJson = orderService.getOrdersByCustomerId(Long.parseLong(customerId));
		return ordersJson;
	}
	
	@GetMapping(path = "/orders/open/{custId}")
	public String getOpenOrdersByCustId(@PathVariable("customerId")long customerId) {
		orderService.getOpenOrdersByCustId(customerId);
		return null;
	}
	
	

}
