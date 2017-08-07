package service;

import model.CustomerJPA;

import java.util.List;

public interface CustomerJPAService {
    void addCustomer(CustomerJPA customer);
    List<CustomerJPA> getAllCustomers();
    CustomerJPA getCustomerById(int id);
    void updateCustomer(CustomerJPA customer);
    void deleteCustomer(int id);
}
