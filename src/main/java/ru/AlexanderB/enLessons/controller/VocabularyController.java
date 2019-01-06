package ru.AlexanderB.enLessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.AlexanderB.enLessons.model.VocWord;
import ru.AlexanderB.enLessons.repository.VocWordRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/vocabulary")
//@Controller
public class VocabularyController {

    @Autowired
    private VocWordRepo vocWordRepo;

    @GetMapping//("/vocabulary")
    public Iterable vocabulary() {//( Map<String, Object> model) {

        Iterable vocwords= vocWordRepo.findAll();

       // model.put("someInMain", "Hello Everyone!");
       // model.put("vocwords", vocwords);
       // return "vocabulary";
        return vocwords;
    }

    @PostMapping//("/vocabulary")
   // public String add(@RequestParam String value, Map<String, Object> model) {
    public Iterable add(@RequestParam String value, Map<String, Object> model) {

        VocWord vocWord=new VocWord(value);
        vocWordRepo.save(vocWord);
        Iterable vocwords= vocWordRepo.findAll();
        model.put("vocwords", vocwords);
        return vocwords;
    }



}
//@RestController
//@RequestMapping("vocabulary")
//public class VocabularyController {
//    private int counter = 4;
//
//    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
//        add(new HashMap<String, String>() {{
//            put("id", "1");
//            put("text", "First message");
//        }});
//        add(new HashMap<String, String>() {{
//            put("id", "2");
//            put("text", "Second message");
//        }});
//        add(new HashMap<String, String>() {{
//            put("id", "3");
//            put("text", "Third message");
//        }});
//    }};
//
//    @GetMapping
//    public List<Map<String, String>> list() {
//        return messages;
//    }
//    @GetMapping("{id}")
//    public Map<String, String> getOne(@PathVariable String id) {
//        return getMessage(id);
//    }
//
////    private Map<String, String> getMessage(@PathVariable String id) {
////        return messages.stream()
////                .filter(message -> message.get("id").equals(id))
////                .findFirst()
////                .orElseThrow(NotFoundException::new);
////    }
//
//    @PostMapping
//    public Map<String, String> create(@RequestBody Map<String, String> message) {
//        message.put("id", String.valueOf(counter++));
//
//        messages.add(message);
//
//        return message;
//    }
//
//    @PutMapping("{id}")
//    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
//        Map<String, String> messageFromDb = getMessage(id);
//
//        messageFromDb.putAll(message);
//        messageFromDb.put("id", id);
//
//        return messageFromDb;
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable String id) {
//        Map<String, String> message = getMessage(id);
//
//        messages.remove(message);
//    }
//}
//
//
