package hagagroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hagagroup.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
