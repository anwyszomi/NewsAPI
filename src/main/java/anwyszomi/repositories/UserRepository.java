package anwyszomi.repositories;

import anwyszomi.domain.Article;
import anwyszomi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
