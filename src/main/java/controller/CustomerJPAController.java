package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.CustomerJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.CustomerJPAService;

import java.util.List;

public class CustomerJPAController {
    @Controller

    public class CustomerController {

        @Autowired
        CustomerJPAService customerService;

        //Json to Java
        private ObjectMapper objectMapper = new ObjectMapper();

        @RequestMapping(value ="/home")
        public String getHome(){
            return "home";
        }

        @RequestMapping(value = "/customers", method= RequestMethod.GET)
        public String getAllCustomers(Model model) {
            List<CustomerJPA> customers = customerService.getAllCustomers();
            model.addAttribute("customers",customers);
            return "customers";
        }

        @RequestMapping(value="/addcustomers", method = RequestMethod.GET)
        public String getAddCustomers(){
            return "addcustomers";
        }

        @RequestMapping(value = "/addcustomers", method =  RequestMethod.POST)
        public String addCustomers(@RequestParam(value="firstname")String firstName,
                                   @RequestParam(value="lastname")String lastName,
                                   @RequestParam(value="phone") String phone,
                                   @RequestParam(value="email")String email){
            CustomerJPA customer = new CustomerJPA();
            customer.setFirstname(firstName);
            customer.setLastname(lastName);
            customer.setPhone(phone);
            customer.setEmail(email);
            customerService.addCustomer(customer);
            return "redirect:/customers";
        }

        @RequestMapping(value= "/{id}", method = RequestMethod.GET)
        public String getCustomerById(@PathVariable int id, Model model){
            CustomerJPA customerById = customerService.getCustomerById(id);
            model.addAttribute("customer", customerById);
            return "viewcustomer";
        }

    }






}


