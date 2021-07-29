package com.mineiro.shoppingcart.repository;

import com.mineiro.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

    Cart findByCustomerId(Long customerId);
}
