package ru.AlexanderB.enLessons.repository;

import org.springframework.data.repository.CrudRepository;
import ru.AlexanderB.enLessons.model.PersonalVocOfWord;
import ru.AlexanderB.enLessons.model.VocWord;

public interface PersonalVocRepo extends CrudRepository <PersonalVocOfWord, Long> {
    PersonalVocOfWord findByWord (VocWord word);
}
