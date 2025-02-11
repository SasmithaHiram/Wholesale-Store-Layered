package service.custom.impl;

import dto.Customer;
import service.custom.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean addCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean searchCustomer(String id) {
        return false;
    }

    @Override
    public boolean updateCustomer(String id, Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
