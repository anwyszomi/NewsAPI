package anwyszomi.supplier;

import anwyszomi.domain.Article;
import anwyszomi.domain.Response;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ApiResponder {

    private static final String urlAllArticleInBBCNews = "https://newsapi.org/v2/everything?sources=bbc-news";
    private static final String apiKey = "&apiKey=451749a4ddfe4621b2a606b3593d4fbc";
    private static final RestTemplate restTemplate = new RestTemplate();

    private static final String urlAllArticle = "https://newsapi.org/v2/everything";

    private static final String urlTopHeadlinesBBCNews = "https://newsapi.org/v2/top-headlines?sources=bbc-news";

    public Response responseOfAllArticleInBBCNews() {
        Response obj = restTemplate.getForObject( urlAllArticleInBBCNews+ apiKey, Response.class );
        return obj;

    }

    public Response responseOfTopHeadlinesBBCNews() {
        Response obj = restTemplate.getForObject( urlTopHeadlinesBBCNews + apiKey, Response.class );
        return obj;
    }

    public Response articlesByTitle(String title) {
        String url =urlAllArticle +"?q="+title+ apiKey ;
        Response articles= restTemplate.getForObject( url,Response.class );
        return articles ;
    }

}
