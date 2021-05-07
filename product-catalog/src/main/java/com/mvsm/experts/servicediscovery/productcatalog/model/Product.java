package com.mvsm.experts.servicediscovery.productcatalog.model;

import lombok.Getter;
import lombok.Data;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "product", type="catalog")
public class Product {

    @Id
    private Long id;

    private String nome;

    private Integer amount;
}
