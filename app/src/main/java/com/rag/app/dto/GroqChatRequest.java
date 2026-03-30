package com.rag.app.dto;
import java.util.List;

public record GroqChatRequest(String model , List<Message> messages){}
