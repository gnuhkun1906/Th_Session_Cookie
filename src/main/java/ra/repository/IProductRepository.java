package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.th3.Product;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {


}
