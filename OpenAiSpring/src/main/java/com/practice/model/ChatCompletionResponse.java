package com.practice.model;

public class ChatCompletionResponse {

	private String role;
	private String content;
	

	public ChatCompletionResponse() {
		super();
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

		
}
