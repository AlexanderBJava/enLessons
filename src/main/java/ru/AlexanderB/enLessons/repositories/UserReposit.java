package ru.AlexanderB.enLessons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.AlexanderB.enLessons.domain.User;


//public interface UserReposit extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//}
public interface UserReposit extends JpaRepository<User, Long>{
    User findByUsername(String username);
}