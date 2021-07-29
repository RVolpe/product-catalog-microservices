package com.mineiro.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("cart")
public class Cart {

    @Id
    private Long id;
    private List<Item> items;

    public Cart(Long id) {
        this.id = id;
    }
}
