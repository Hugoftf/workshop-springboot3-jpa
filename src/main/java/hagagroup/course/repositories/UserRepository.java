package hagagroup.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hagagroup.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
