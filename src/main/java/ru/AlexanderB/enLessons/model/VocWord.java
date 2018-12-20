package ru.AlexanderB.enLessons.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Класс - модель которая описывает объект Word, этот объект представляет собой слова из словаря
 *
 * @author Aleksandr Kovalev
 * */
@Entity
@Table(name = "vocabulary")
@Data
@NoArgsConstructor
public class VocWord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_vocabulary")
    @SequenceGenerator(name = "seq_id_vocabulary", sequenceName = "seq_id_vocabulary", allocationSize = 1)
    private Long id;
    private String value;

    public VocWord(String value) {
        this.value = value;
    }
}
