package ru.AlexanderB.enLessons.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.AlexanderB.enLessons.model.VocWord;
import ru.AlexanderB.enLessons.repository.VocWordRepo;

import javax.validation.constraints.NotNull;
import java.util.Map;

@Service

public class VocWordService {

    @Autowired
    private VocWordRepo vocWordRepo;

    public Iterable getAll() {

        Iterable vocwords= vocWordRepo.findAll();
        //ToDo пагинация

        return vocwords;
    }

    public VocWord add(@NotNull VocWord vocWord) {
        VocWord result = null;
        // VocWord vocWord = new VocWord(value);
        if (vocWord.getId() != null) {
            vocWord.setId(null);
        }
        if (vocWordRepo.findByValue(vocWord.getValue()) == null) {
            result = vocWordRepo.save(vocWord);
        }

        return result;


    }



    public void delete(Long id){
       vocWordRepo.deleteById(id);

    }

}




