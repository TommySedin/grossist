package se.adopi.edu.grossist;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/articles")
public class ArticleListService {
	@Inject
	private List<Article> articles;
	
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
