package com.SpringAI.Service;

import java.util.List;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private ChatModel chatModel;


    public String generateResponse(String inputText) {

        // call reposnse through chatModel
        String response = chatModel.call(inputText);
        return response;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'generateResponse'");
    }


    // public List<String> generateImages(String imageDesc, String size, int numbers){
    //     String template = this.loadPromptTemplate("prompts/image_bot.txt");
    // }
}
