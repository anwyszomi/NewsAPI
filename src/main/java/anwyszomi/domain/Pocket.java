package anwyszomi.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "pocket", cascade = CascadeType.ALL)
    private Set <Article> articles = new HashSet <>();
    @OneToOne
    private User user;

    @Override
    public String toString() {
        return "Pocket{" +
                "id=" + id +
                ", articles=" + articles +
                ", user=" + user +
                '}';
    }

    public Set <Article> getArticles() {
        return articles;
    }

    public void setArticles(Set <Article> articles) {
        this.articles = articles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
