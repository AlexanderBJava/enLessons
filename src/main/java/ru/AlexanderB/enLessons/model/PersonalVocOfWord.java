package ru.AlexanderB.enLessons.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Класс - модель для сбора статистику выученных слов пользователями
 * TODO: впиши автора
 * */

@Entity
@Table(name = "words_statistic", uniqueConstraints = @UniqueConstraint(columnNames = {"words","user"}))
@Data
@NoArgsConstructor
public class PersonalVocOfWord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_personal_vocabulary")
    @SequenceGenerator(name = "seq_id_personal_vocabulary", sequenceName = "seq_id_personal_vocabulary", allocationSize = 1)
    private Long id;

    @ManyToOne
    private VocWord word;

    private int statistic;
    //mc <--> mvvm
    @ManyToOne
    private User user;
}
