package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class YeatisService {

    //start

    public SendMessage greeting(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Greetings\uD83D\uDC4B\n" +
                "Welcome to \"Yeati's\" Telegram bot\n" +
                "Choose your language\uD83C\uDF10:\n" +
                "\n" +
                "Assalomu aleykum\uD83D\uDC4B\n" +
                "\"Yeati's\"ning telegram botiga hush kelibsiz\n" +
                "Sizga qulay bo'lgan tilni tanlang\uD83C\uDF10:\n" +
                "\n" +
                "Здраствуйте\uD83D\uDC4B\n" +
                "Добро пожаловать в телеграм бота \"Yeati's\"\n" +
                "Выберите ваш язык\uD83C\uDF10:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7English");
        button.setCallbackData("eng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek");
        button.setCallbackData("uzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFAРусский");
        button.setCallbackData("rus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage changeLanguageEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose your language:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7English");
        button.setCallbackData("eng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek");
        button.setCallbackData("uzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFAРусский");
        button.setCallbackData("rus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage changeLanguageUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tilingizni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7English");
        button.setCallbackData("eng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek");
        button.setCallbackData("uzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFAРусский");
        button.setCallbackData("rus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage changeLanguageRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите ваш язык:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7English");
        button.setCallbackData("eng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek");
        button.setCallbackData("uzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFAРусский");
        button.setCallbackData("rus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //start

    //shaxar

    public SendMessage cityEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose your city:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Change language");
        button.setCallbackData("chLanEng");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage cityUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Shaxaringizni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Tilni o'zgartirish");
        button.setCallbackData("chLanUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage cityRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите ваш город:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Поменять язык");
        button.setCallbackData("chLanRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage cityEngShort(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Uhm... We can't deliver our products there at the moment \nChoose another city:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Change language");
        button.setCallbackData("chLanEng");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage cityUzbShort(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz hozir... U yerga mahsulotlarni yetkazib bera olmaymiz \nBoshqa shaxar tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Tilni o'zgartirish");
        button.setCallbackData("chLanUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage cityRusShort(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Эм... В данный момент доставка на этот регион не работает \nВыберите другой город:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("city");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Поменять язык");
        button.setCallbackData("chLanRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //shaxar
}
