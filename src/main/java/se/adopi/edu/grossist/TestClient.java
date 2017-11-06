package se.adopi.edu.grossist;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Path("/testclient")
public class TestClient {
	@GET
	@Path("")
	@Produces(MediaType.TEXT_PLAIN)
	public String callWebservice() {
		Client client = ClientBuilder.newClient();
		WebTarget articlesTarget = client.target("http://localhost:8080/grossist/articles");
		WebTarget sockerTarget = articlesTarget.path("get/socker");
		Article socker = sockerTarget.request(MediaType.APPLICATION_XML).get(Article.class);
		
		return (socker.getName() + ": " + socker.getCostPerUnit() + " per " + socker.getUnit());
	}

}
