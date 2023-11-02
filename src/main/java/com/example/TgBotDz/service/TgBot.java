package com.example.TgBotDz.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class TgBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()){
            String messageText ="Ваше сообщение: " + update.getMessage().getText();

            long chatID = update.getMessage().getChatId();
            SendMessage message = new SendMessage();
            message.setText(messageText);
            message.setChatId(chatID);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Override
    public String getBotUsername() {
        return "JavaHomeWorkBot";
    }

    @Override
    public String getBotToken(){
        return "6433076071:AAEDTA9DlUreYw9vyG2xwSFqJZhGQDw3dMY";
    }
}
