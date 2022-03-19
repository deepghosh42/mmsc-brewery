package com.deep.mmscbrewery.web.service;

import com.deep.mmscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {

    public CustomerDto getCustomerById(UUID customerId);
}
