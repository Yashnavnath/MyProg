package com.springcore.Q11;

public class Result {
	int math;
	int science;
	int hindi;
	int english;
	int totalmarks;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int math, int science, int hindi, int english) {
		super();
		this.math = math;
		this.science = science;
		this.hindi = hindi;
		this.english = english;
		this.totalmarks = math+science+hindi+english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Result [math=" + math + ", science=" + science + ", hindi=" + hindi + ", english=" + english
				+ ", totalmarks=" + totalmarks + "]";
	}
	

	
	
	
	
	

}
