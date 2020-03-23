package io.mulshankar13.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author mulshankar13
 *
 */

@RestController
public class ShoppingCartRestCtrl {

	private final Logger logger = LoggerFactory.getLogger(ShoppingCartRestCtrl.class);

	@Autowired
	private CartService cartService;

//	@GetMapping(path = "/items1",params = "version=1")
//	public String getAllItemsInStock() {
//		logger.debug(" Start: Getting all products.... ");
//		String products = cartService.getItemsInCart();
//		return products;
//	}
	
	@GetMapping(path = "/items1",params = "version=1")
	public String getAllItemsInCart(@RequestParam String customerId) {
		System.out.println("@!@!#@!# getAllItemsInCart :"+customerId);
		logger.debug(" Start: Getting all products.... ");
		String items = cartService.getItemsInCustomerCart(customerId);
		return items;
	}
	
	/**
	 * Same Resource URI versioned to return the count
	 * @return
	 */
	@GetMapping(path = "/items1",params = "version=2")
	public int getAllItemsInCartCount() {
		logger.debug(" Start: getAllItemsSorted .... ");
		int count = cartService.getProductsCount();
		logger.debug(" End: getAllItemsSorted .... ");
		return count;
	}

	@GetMapping("/customers")
	public String getAllCustomers() {
		logger.debug(" Start : Getting all customers");
		String customers = cartService.getCustomers();
		return customers;
	}

}
