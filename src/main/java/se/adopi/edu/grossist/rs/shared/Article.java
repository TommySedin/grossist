package se.adopi.edu.grossist.rs.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	@XmlElement
	private String name;
	@XmlElement
	private float costPerUnit;
	@XmlElement
	private String unit;

	public Article() {}
	public Article(String name, float costPerUnit, String unit) {
		this.name = name;
		this.costPerUnit = costPerUnit;
		this.unit = unit;
	}

	public String getName() { return name; }
	public float getCostPerUnit() { return costPerUnit; }
	public String getUnit() { return unit; }

	public static List<Article> getArticles() {
		List<Article> result = new ArrayList<>();
		result.add(new Article("Vetemjöl", 2f, "kg"));
		result.add(new Article("Mjölk", 5f, "l"));
		result.add(new Article("Socker", 5f, "kg"));
		result.add(new Article("Ägg", 0.1f, "st"));
		return result;
	}
}
