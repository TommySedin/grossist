package se.adopi.edu.grossist;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
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
}
