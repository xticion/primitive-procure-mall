package com.xticion.mall.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.xticion.mall.dto.CustomerAddCmd;
import com.xticion.mall.dto.CustomerListByNameQry;
import com.xticion.mall.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
