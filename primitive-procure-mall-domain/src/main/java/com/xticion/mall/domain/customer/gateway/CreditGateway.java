package com.xticion.mall.domain.customer.gateway;

import com.xticion.mall.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
