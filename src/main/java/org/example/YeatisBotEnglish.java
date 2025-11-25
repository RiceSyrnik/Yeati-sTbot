package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class YeatisBotEnglish extends TelegramLongPollingBot {
    int promocount = 0;
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



            //promocode

//            else if(message.equals("MANESHAKMAN") && promocount>0) {
//                try {
//                    execute(yetis.PromoShakman(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            } else if(!message.equals("MANESHAKMAN") && promocount<0) {
//                try {
//                    execute(yetis.InvalidPromoUzb(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

            //promocode

            //til
        }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId1 = callbackQuery.getMessage().getChatId();

            Integer messageId = callbackQuery.getMessage().getMessageId();

            //language

            if (data.equals("eng")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.cityEng(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chLanEng")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.changeLanguageEng(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //language

            //city

            if (data.equals("cityOfNibrE")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.cityEngShort(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //city

            //menu

            if (data.equals("cityU")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.MenuEng(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("menuEng")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.MenuEng(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //menu

            //contact

            if (data.equals("aleuEng")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(yetis.contactEng(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //contact



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
