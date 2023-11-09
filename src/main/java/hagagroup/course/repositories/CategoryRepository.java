package hagagroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hagagroup.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
