package io.mulshankar13.shoppingcart;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mulshankar13.model.CartOrder;

public interface OrderRepository extends JpaRepository<CartOrder, Long>{

}
