package com.rag.app.dto;
import  java.util.List;

public record GroqChatResponse(List<Choice> choices){
    public record Choice(Message message){}
}
