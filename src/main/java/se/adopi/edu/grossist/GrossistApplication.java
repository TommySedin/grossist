package se.adopi.edu.grossist;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("")
public class GrossistApplication extends Application {
	@Produces
	public List<Article> getArticles() {
		List<Article> result = new ArrayList<>();
		result.add(new Article("Mjöl", 2f, "kg"));
		result.add(new Article("Mjölk", 5f, "l"));
		result.add(new Article("Socker", 5f, "kg"));
		result.add(new Article("Ägg", 0.1f, "st"));
		return result;
	}
}
 