package com.example.model;

public class Login_User {

	@Override
	public String toString() {
		return "Login_User [name=" + name + ", pass=" + pass + "]";
	}

	private String name;
	private int pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
}
