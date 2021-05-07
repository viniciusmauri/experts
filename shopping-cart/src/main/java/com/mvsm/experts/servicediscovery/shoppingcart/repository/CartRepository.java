package com.mvsm.experts.servicediscovery.shoppingcart.repository;

import com.mvsm.experts.servicediscovery.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    Cart findByCustomerId(Integer customerId);
}
