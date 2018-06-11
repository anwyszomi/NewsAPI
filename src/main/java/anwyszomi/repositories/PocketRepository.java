package anwyszomi.repositories;

import anwyszomi.domain.Article;
import anwyszomi.domain.Pocket;
import anwyszomi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PocketRepository extends JpaRepository <Pocket, Long> {
}
