package ru.AlexanderB.enLessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VocWordRepo extends JpaRepository<VocWordRepo,Long> {
    VocWordRepo finfByValue (String value);

}
