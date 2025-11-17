package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.sql.SQLOutput;

public class YeatisBot extends TelegramLongPollingBot {

    YeatisService yetis = new YeatisService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            String firstName = update.getMessage().getFrom().getFirstName();
            String lastName = update.getMessage().getFrom().getLastName();

            System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nMessage: " +  message);

            if (message.equals("/start")) {
                try {
                    execute(yetis.greeting(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

                //til
            }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();

            Integer messageId = callbackQuery.getMessage().getMessageId();

            //til

            if(data.equals("eng")){
                try {
                    execute(yetis.cityEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("cityOfNibrE")){
                try {
                    execute(yetis.cityEngShort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("uzb")){
                try {
                    execute(yetis.cityUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("cityOfNibrU")){
                try {
                    execute(yetis.cityUzbShort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("rus")){
                try {
                    execute(yetis.cityRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("cityOfNibrR")){
                try {
                    execute(yetis.cityRusShort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if(data.equals("chLanUzb")){
                try {
                    execute(yetis.changeLanguageUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("chLanEng")){
                try {
                    execute(yetis.changeLanguageEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("chLanRus")){
                try {
                    execute(yetis.changeLanguageRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

    @Override
    public String getBotUsername() {
        return "yeatisnotabot";
    }
    @Override
    public String getBotToken() {
        return "8354221150:AAHI4QbVxR49qJes0XEBmRjx0bIFIXR98VI";
    }
}
