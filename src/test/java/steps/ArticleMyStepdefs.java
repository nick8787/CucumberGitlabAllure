package steps;

import api.Article;
import impl.ArticleServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import service.ArticleService;

import java.util.List;

public class ArticleMyStepdefs {
    ArticleService articleService = new ArticleServiceImpl();

    @Given("Get Articles {string} Request")
    public void getArticlesRequest(String url) {
        List<Article> articleList = articleService.getArticles(url);
        System.out.println(articleList);
    }

    @Then("Response code is: {string}")
    public void responseCodeIs(String status) {
    }
}
