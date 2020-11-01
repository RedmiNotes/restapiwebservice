package com.springrest.studyeasy;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	
	@Id
	@Column(name = "id")
	int Id;
	@Column(name = "name")
	String name;
	@Column(name = "location")
	String location;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Post() {}
	public Post(int Id,String name,String location) {
		this.Id = Id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Post [Id=" + Id + ", name=" + name + ", location=" + location + "]";
	}
}