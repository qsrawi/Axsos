package com.codingdojo.abstractart;

public class Sculpture extends Art {
 protected String material;

public Sculpture(String author,String title,String description,String material) {
	super.author=author;
	super.title=title;
	super.description=description;
	this.material = material;
}

@Override
public void viewArt() {
	System.out.println(super.author);
	System.out.println(super.title);
	System.out.println(material);
	System.out.println(super.description);
	
}
 
}
