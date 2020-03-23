package io.mulshankar13.shoppingcart;

import java.util.List;

import io.mulshankar13.model.Item;

public interface ItemRepositoryCustom {

	List<Item> findAllItemsByOrderId(long id);

}
