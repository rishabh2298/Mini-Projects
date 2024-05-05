package com.practice.model;

public class ChatMessage {
	
	private String role;
	private String content;
	
	
	public ChatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ChatMessage(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}


	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		this.content = content;
	}

	
}
