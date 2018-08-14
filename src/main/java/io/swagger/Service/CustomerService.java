package io.swagger.Service;

import io.swagger.Repo.CustomerRepo;
import io.swagger.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService
{
    @Autowired
    private CustomerRepo customerRepo;

    public void addCustomer(Customer customer)
    {
        customerRepo.save(customer);
    }
}
