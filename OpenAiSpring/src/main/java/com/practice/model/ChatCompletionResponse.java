package com.practice.model;

import java.util.List;

public class ChatCompletionResponse {

	private List<Choices> choices;
	

	public static class Choices{
		
		private int index;
		private ChatMessage message;
		
		
		public Choices() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Choices(int index, ChatMessage message) {
			super();
			this.index = index;
			this.message = message;
		}

		
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public ChatMessage getMessage() {
			return message;
		}
		public void setMessage(ChatMessage message) {
			this.message = message;
		}
		
	}
	
	
	public ChatCompletionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Choices> getChoices() {
		return choices;
	}
	public void setChoices(List<Choices> choices) {
		this.choices = choices;
	}
	
}
