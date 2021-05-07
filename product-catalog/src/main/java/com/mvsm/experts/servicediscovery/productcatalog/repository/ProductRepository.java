package com.mvsm.experts.servicediscovery.productcatalog.repository;

import com.mvsm.experts.servicediscovery.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
