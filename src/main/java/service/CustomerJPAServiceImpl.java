package service;

import Repository.CustomerJPARepository;
import model.CustomerJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerJPAServiceImpl {

    @Service
    public class CustomerServiceImpl implements CustomerJPAService{
        @Autowired
        CustomerJPARepository customerRepository;

        @Transactional
        @Override
        public void addCustomer(CustomerJPA customer) {

            customerRepository.addCustomer(customer);
        }

        @Override
        public List<CustomerJPA> getAllCustomers() {

            return customerRepository.getAllCustomers();
        }
        @Override
        public CustomerJPA getCustomerById(int id) {

            return customerRepository.getCustomerById(id);
        }

        @Transactional
        @Override
        public void updateCustomer(CustomerJPA customer) {
            customerRepository.updateCustomer(customer);
        }

        @Transactional
        @Override
        public void deleteCustomer(int id) {

            customerRepository.deleteCustomer(id);
        }
    }
}
