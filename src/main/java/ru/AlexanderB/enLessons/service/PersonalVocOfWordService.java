package ru.AlexanderB.enLessons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.AlexanderB.enLessons.model.PersonalVocOfWord;
import ru.AlexanderB.enLessons.repository.PersonalVocRepo;

import javax.validation.constraints.NotNull;

/***
 * TODO: Реализовать Repository для классов словаря и статистики, реализовать функции в сервисе для добавления слов,
 * TODO: для выборки количества слов с низкой статистикой, для обновления статистики
 */

@Service
public class PersonalVocOfWordService {
    @Autowired
    private PersonalVocRepo personalVocRepo;

    public PersonalVocOfWord add(@NotNull PersonalVocOfWord personalVocOfWord) {
        PersonalVocOfWord result = null;
        // VocWord vocWord = new VocWord(value);
        if (personalVocOfWord.getId() != null) {
            personalVocOfWord.setId(null);
        }
        if (personalVocRepo.findByWord(personalVocOfWord.getWord()) == null) {
            result = personalVocRepo.save(personalVocOfWord);
        }

        return result;


    }

    public Iterable getAll() {

        Iterable personalVocOfWords= personalVocRepo.findAll();
        //ToDo пагинация

        return personalVocOfWords;
    }

    public void delete(Long id){
        personalVocRepo.deleteById(id);

    }






}
