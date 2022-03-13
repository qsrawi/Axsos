package com.codingdojo.abstractart;

public class Museum {

	public static void main(String[] args) {
		Painting paint=new Painting("oday","mah","hello world!","oil");
		paint.viewArt();
		Sculpture sculpture=new Sculpture("oday","mah","hello world!","soil");
		sculpture.viewArt();
	}

}
