package ra.service;

import org.springframework.stereotype.Service;
import ra.model.th3.Product;

import java.util.Optional;


public interface IProductService {

    Iterable<Product> findAll();
    Optional<Product> findById(Long id);

}
