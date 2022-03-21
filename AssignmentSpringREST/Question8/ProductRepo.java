package Question8;


import Question8.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends MongoRepository<Product,String>
{
}
