package io.mulshankar13.shoppingcart;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import io.mulshankar13.model.Item;

@Repository
@org.springframework.transaction.annotation.Transactional
public class ItemServiceImpl implements ItemRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Item> findAllItemsByOrderId(long id) {

		Query query = entityManager.createNativeQuery("SELECT * FROM item " + "WHERE cart_order__id = ?", Item.class);
		query.setParameter(1, id);
		@SuppressWarnings("unchecked")
		List<Item> items = query.getResultList();
		System.out.println(" @#@!@! items :" + items);
		return items;
	}

}
