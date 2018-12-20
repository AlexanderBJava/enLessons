package ru.AlexanderB.enLessons.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.repository.CrudRepository;
        import ru.AlexanderB.enLessons.model.VocWord;

public interface VocWordRepo extends CrudRepository<VocWord,Long> {
    //VocWordRepo finfByValue (String value);

}
