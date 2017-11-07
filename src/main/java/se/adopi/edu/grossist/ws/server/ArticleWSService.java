package se.adopi.edu.grossist.ws.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="ws/articles")
public class ArticleWSService {
	private List<Article> articles = Article.getArticles();

	@WebMethod
	public List<Article> getArticles() {
		return articles;
	}

	@WebMethod
	public Article getArticle(String articleName) {
		for (Article a : articles) {
			if (a.getName().equalsIgnoreCase(articleName)) {
				return a;
			}
		}
		throw new IllegalArgumentException("No such article \""+articleName+"\"");
	}
}
