package com.backend.quizapp.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class UserTable {
    
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Id
	private long userid;
	private String name;
	@Override
	public String toString() {
		return "UserTable [userid=" + userid + ", name=" + name + ", catagory=" + catagory + ", score=" + score + "]";
	}
	private String catagory;
	private int score;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
