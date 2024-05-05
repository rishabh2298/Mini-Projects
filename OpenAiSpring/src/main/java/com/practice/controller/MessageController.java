package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.practice.model.ChatCompletionRequest;
import com.practice.model.ChatCompletionResponse;


@RestController
public class MessageController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/welcome")
	public String welcomeHandler() {
		return "Welcome to OpenAI springBoot Integration project";
	}

	
	@PostMapping("/openAiRequest")
	public String getOpenApiResponseHandler(@RequestBody String prompt) {

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest(prompt);
		
		ChatCompletionResponse chatCompletionResponse = restTemplate.postForObject("https://api.openai.com/v1/chat/completions", 
																					chatCompletionRequest, 
																					ChatCompletionResponse.class);
		
		return chatCompletionResponse.getChoices().get(0).getMessage().getcontent();

	}
	
}
