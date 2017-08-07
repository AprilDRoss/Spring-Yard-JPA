package Repository;

import model.CustomerJPA;

import java.util.List;

public interface CustomerJPARepository {
    void addCustomer(CustomerJPA customer);
    List<CustomerJPA> getAllCustomers();
    CustomerJPA getCustomerById(int id);
    void updateCustomer(CustomerJPA customer);
    void deleteCustomer(int id);
}
