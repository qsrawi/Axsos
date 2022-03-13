package com.codingdojo.abstractart;

public class Painting extends Art {
	protected String paintType;

	public Painting(String author,String title,String description,String paintType) {
		super.author=author;
		super.title=title;
		super.description=description;
		this.paintType=paintType;
	}

	@Override
	public void viewArt() {
		System.out.println(super.author);
		System.out.println(super.title);
		System.out.println(paintType);
		System.out.println(super.description);
	}
	

}
