package se.adopi.edu.grossist.rs.server;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import se.adopi.edu.grossist.rs.shared.Article;

@Path("/rs/articles")
public class ArticleRSService {
	private List<Article> articles = Article.getArticles();
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_XML)
	public List<Article> getArticles() {
		return articles;
	}

	@GET
	@Path("/get/{articlename}")
	@Produces(MediaType.APPLICATION_XML)
	public Article getArticle(@PathParam("articlename") String articleName) {
		for (Article a : articles) {
			if (a.getName().equalsIgnoreCase(articleName)) {
				return a;
			}
		}
		throw new IllegalArgumentException("No such article \""+articleName+"\"");
	}
}
