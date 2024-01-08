package com.lgy.spring_6_3;

import java.util.ArrayList;

public class Nasdaq {
	private String stock;
	private int rank;
	private ArrayList<String> product;
	
	public Nasdaq(String stock) {
		
		this.stock = stock;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public ArrayList<String> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<String> product) {
		this.product = product;
	}
	
}
