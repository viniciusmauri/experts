package com.mvsm.experts.servicediscovery.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Integer productId;

    private Integer amount;
}
