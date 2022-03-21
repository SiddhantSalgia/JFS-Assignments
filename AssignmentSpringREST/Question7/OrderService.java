package Question7;

import Question7.OrderRepo;
import Question7.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService
{
    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAllOrders(){
        //System.out.println(orderRepo.findAll());
        return  orderRepo.findAll();
    }

    public Order AddOrder(Order order){


        return orderRepo.insert(order);
    }
    public  Order getOrderById(String id){
        return  orderRepo.findById(id).get();
    }
    public  boolean deteleOrder(String id){
        orderRepo.deleteById(id);
        return true;
    }
    public  Order updateOrder(Order order){
        return  orderRepo.save(order);
    }

}
