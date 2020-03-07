package com.restful.Assign.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Product {

	@Id
	@GeneratedValue(generator="system-uuid")	
	@GenericGenerator(name="system-uuid", strategy = "uuid")
private String id;
	private String name;
	private String description;
	private String brand;
	
	@ElementCollection
	@CollectionTable(name = "product_tags",
    joinColumns = @JoinColumn(name = "product_id"))
	@Column(name = "tags")
	private List<String> tags=new ArrayList<String>();  ;
	private String category;
	@CreationTimestamp
	private LocalDateTime  created_at;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String id, String name, String description, String brand, List<String> tags, String category,
		LocalDateTime  created_at) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.brand = brand;
	this.tags = tags;
	this.category = category;
	this.created_at = created_at;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public List<String> getTags() {
	return tags;
}
public void setTags(List<String> tags) {
	this.tags = tags;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public LocalDateTime  getCreated_at() {
	return created_at;
}
public void setCreated_at(LocalDateTime  created_at) {
	this.created_at = created_at;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", tags=" + tags
			+ ", category=" + category + ", created_at=" + created_at + "]";
}

}
