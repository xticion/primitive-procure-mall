package com.xticion.mall.dto.event;

import static com.xticion.mall.dto.event.DomainEventConstant.CUSTOMER_CREATED_TOPIC;

/**
 * CustomerCreatedEvent
 *
 * @author Frank Zhang
 * @date 2019-01-04 10:32 AM
 */
public class CustomerCreatedEvent{

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
