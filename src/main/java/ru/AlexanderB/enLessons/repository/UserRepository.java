package ru.AlexanderB.enLessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.AlexanderB.enLessons.domain.User;


//public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//}
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}