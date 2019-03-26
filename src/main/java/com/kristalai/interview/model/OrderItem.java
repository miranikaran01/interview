package com.kristalai.interview.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

    @ManyToOne
    Pizza pizza;

    int quantity;


}
