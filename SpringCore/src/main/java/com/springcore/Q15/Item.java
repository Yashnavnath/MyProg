package com.springcore.Q15;

public class Item {
	String iname;
	int price;
	String expdate;
	String mfgdate;
	Category category;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String iname, int price, String expdate, String mfgdate, Category category) {
		super();
		this.iname = iname;
		this.price = price;
		this.expdate = expdate;
		this.mfgdate = mfgdate;
		this.category = category;
	}
	 
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [iname=" + iname + ", price=" + price + ", expdate=" + expdate + ", mfgdate=" + mfgdate
				+ ", category=" + category + "]";
	}
	

}
