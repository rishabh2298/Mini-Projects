package com.practice.model;

import java.util.ArrayList;
import java.util.List;

public class ChatCompletionRequest {

	
	private String model;
	private List<ChatMessage> messages;
	
	
	public ChatCompletionRequest(String prompt) {
		this.model = "gpt-3.5-turbo";
		this.messages = new ArrayList<>();
		
		this.messages.add(new ChatMessage("user", prompt));
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<ChatMessage> getMessages() {
		return messages;
	}
	public void setMessages(List<ChatMessage> messages) {
		this.messages = messages;
	}
	
}
