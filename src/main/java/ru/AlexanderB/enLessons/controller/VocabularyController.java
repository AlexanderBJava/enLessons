package ru.AlexanderB.enLessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.AlexanderB.enLessons.model.VocWord;
import ru.AlexanderB.enLessons.repository.VocWordRepo;

import java.util.Map;

@Controller
public class VocabularyController {

    @Autowired
    private VocWordRepo vocWordRepo;

    @GetMapping("/vocabulary")
    public String vocabulary( Map<String, Object> model) {

        Iterable vocwords= vocWordRepo.findAll();
        model.put("someInMain", "Hello Everyone!");
        model.put("vocwords", vocwords);
        return "vocabulary";
    }

    @PostMapping("/vocabulary")
    public String add(@RequestParam String value, Map<String, Object> model) {
        VocWord vocWord=new VocWord(value);
        vocWordRepo.save(vocWord);
        Iterable vocwords= vocWordRepo.findAll();
        model.put("vocwords", vocwords);
        return "vocabulary";
    }



}
