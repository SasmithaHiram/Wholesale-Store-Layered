package service.custom;

import dto.Customer;
import service.SuperService;

import java.util.List;

public interface CustomerService extends SuperService {
    boolean addCustomer(Customer customer);
    boolean searchCustomer(String id);
    boolean updateCustomer(String id, Customer customer);
    boolean deleteCustomer(String id);
    List<Customer> getAll();

}
