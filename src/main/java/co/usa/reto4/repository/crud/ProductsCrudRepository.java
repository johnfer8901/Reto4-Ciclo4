package co.usa.reto4.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.usa.reto4.model.Products;

public interface ProductsCrudRepository extends MongoRepository<Products, Integer>{
    
    
}
