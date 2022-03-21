package Question9;

import Question9.CustomerService;
import Question9.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public List<Customer> getAllDetails(){
        List<Customer> customerList= customerService.getAllCustomer();
        return customerList;
    }

    @RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value="/customer",method =RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer cust){
        return customerService.addCustomer(cust);

    }

    @RequestMapping(value="/customer/{id}",method = RequestMethod.DELETE)
    public boolean deleteCustomer(@PathVariable("id") int id){
        return customerService.deleteCustomer(id);

    }

    @RequestMapping(value = "/customer",method = RequestMethod.PUT)
    public Customer updateEmployee(@RequestBody Customer cust){
        return customerService.updateEmployee(cust);
    }
}
