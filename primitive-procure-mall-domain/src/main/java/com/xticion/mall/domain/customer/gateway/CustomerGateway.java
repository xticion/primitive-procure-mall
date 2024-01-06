package com.xticion.mall.domain.customer.gateway;

import com.xticion.mall.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
