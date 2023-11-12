package hagagroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hagagroup.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
