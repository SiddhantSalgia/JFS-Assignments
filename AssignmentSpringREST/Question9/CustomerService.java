package Question9;

import Question9.CustomerRepo;
import Question9.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> getAllCustomer(){
        final List<Customer> customerList = new ArrayList<>();

        customerRepo.findAll().forEach(customerList::add);
        return  customerList;
    }

    public Customer getCustomerById(int id){
        return  customerRepo.findById(id).get();
    }

    public Customer addCustomer(Customer cust){
        return customerRepo.save(cust);
    }

    public boolean deleteCustomer(int id){
        customerRepo.deleteById(id);
        return true;
    }
    public Customer updateEmployee(Customer cust){
        return customerRepo.save(cust);
    }

}
