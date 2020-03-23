package io.mulshankar13.shoppingcart;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.mulshankar13.model.Cart;
import io.mulshankar13.model.Item;

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

	@GetMapping(path = "v1/items")
	public String getAllItemsInCart(@RequestParam String customerId) {
		System.out.println("@!@!#@!# getAllItemsInCart :" + customerId);
		logger.debug(" Start: Getting all products.... ");
		String items = cartService.getItemsInCustomerCart(customerId);
		return items;
	}

	/**
	 * Same Resource URI versioned to return the count
	 * 
	 * @return
	 */
	@GetMapping(path = "v2/items")
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

	@PostMapping("/cart/{id}/item")
	public String addItemToCart(@PathVariable int id, @RequestBody Item item) {
		System.out.println("#$@#$@#$  addItemToCart id =" + id);
		Cart cart = cartService.getCartById(id); // TODO null check
		System.out.println(" cart :" + cart);
		item.setCart(cart);
		System.out.println(" $@##@ Item to be saved ..." + item);
		String itemSavedJson = cartService.addItemToCart(item);
		return itemSavedJson;
	}

}
