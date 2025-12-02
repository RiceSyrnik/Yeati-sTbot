package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

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
    public InlineKeyboardMarkup changeLanguageRus(Long chatId) {
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
        return inlineKeyboardMarkup;
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
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
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
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
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
    public InlineKeyboardMarkup cityRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите ваш город:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("TheNiberland");
        button.setCallbackData("cityOfNibrR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Поменять язык");
        button.setCallbackData("chLanRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
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
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("City");
        button.setCallbackData("cityU");
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
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Shaxar");
        button.setCallbackData("cityE");
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
    public InlineKeyboardMarkup cityRusShort(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Эм... В данный момент доставка на этот регион не работает \nВыберите другой город:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Город");
        button.setCallbackData("cityR");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Поменять язык");
        button.setCallbackData("chLanRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    //shaxar

    //menu

    public SendMessage MenuUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menyu");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF5FZakaz qilmoq");
        button.setCallbackData("orderUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCE8Sharhlar");
        button.setCallbackData("revUzb");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Biz haqimizda");
        button.setCallbackData("abotusUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("☎\uFE0FBog'lanmoq");
        button.setCallbackData("aleuUzb");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDFB0Promokod");
        button.setCallbackData("promoUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF10Tilni o'zgartirish");
        button.setCallbackData("chLanUzb");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage MenuEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF5FOrder");
        button.setCallbackData("orderEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCE8Reviews");
        button.setCallbackData("revEng");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("About us");
        button.setCallbackData("abotusEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("☎\uFE0FContact us");
        button.setCallbackData("aleuEng");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDFB0Promocode");
        button.setCallbackData("promoEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCBCJoin us");
        button.setCallbackData("jobEng");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public InlineKeyboardMarkup MenuRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Меню");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDF5FЗаказать");
        button.setCallbackData("orderRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCE8Отзывы");
        button.setCallbackData("revRus");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("О нас");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("☎\uFE0FСвзаться");
        button.setCallbackData("aleuRus");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDFB0Промокод");
        button.setCallbackData("promoRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCBCПрисоединяйтесь к нам");
        button.setCallbackData("jobRus");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    //menu

    //order


    //order

    //promocode

    public SendMessage PromoEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Enter the promocode");
        return sendMessage;
    }
    public SendMessage PromoUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Promokodni kirting");
        return sendMessage;
    }
    public SendMessage PromoRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Введите промокод");
        return sendMessage;
    }
    public SendMessage InvalidPromoUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Promokod noto'g'ri");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDD04Boshqatdan terish");
        button.setCallbackData("AgainUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage InvalidPromoEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Incorrect");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDD04Try again");
        button.setCallbackData("AgainEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuEng");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage InvalidPromoRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Неправильно");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDD04Заново");
        button.setCallbackData("AgainRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage PromoShakman(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Eshakmisan?");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //promocode

    //aboutus

    public SendMessage aboutUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCC6 Yeati's XX/XX/XXXX sanasida ochilgan.\n" +
                "Dastlab u unchalik mashhur bo‘lmagan, ammo katta mehnat bilan jamoamiz Yeati’sni butun koinotdagi eng yaxshi fastfud tarmog‘iga aylantira oldi!\n" +
                "✨Biz raqobatchilarimiz hatto orzu ham qila olmaydigan shuhrat va ishonchga ega bo‘ldik!\n" +
                "Biz fastfud\uD83C\uDF54, sog‘lom taomlar\uD83E\uDD57, ichimliklar\uD83E\uDD64, shirinliklar\uD83C\uDF6D, pishiriqlar\uD83E\uDDC1 va mijozlarimizni baxtli qiladigan har qanday narsani sotamiz! (menyudagi hamma narsalar bu yerda mavjud emas).\n" +
                "❤\uFE0F\u200D\uD83E\uDE79Ko‘pchilik odamlar bizni tanlaydi, chunki biz qulaylik, sifat, maza va oddiy fastfuddan ham ko‘proq narsani taqdim eta olamiz!\n" +
                "\uD83E\uDD16Ushbu botni mijozlarimiz o‘z hozirgi joylashuvlaridan oson ovqat buyurtma qila olishlari uchun yaratdik!\n" +
                "Quyida odamlarning ko‘pchiligi beradigan ba’zi savollar:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Qanday to'lov turlari mavjud?");
        button.setCallbackData("pavementUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Qachon ishlaysizlar?");
        button.setCallbackData("datesUzb");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Mahsulotlar halolmi?");
        button.setCallbackData("halyalUzb");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Niber kim?");
        button.setCallbackData("nobodyUzb");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage aboutEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCC6Yeati's was opened on XX/XX/XXXX.\n" +
                "It wasn't that popular on the beginning, but with a lot of effort, our team managed to make Yeati's the best fast food chain in the whole universe!\n" +
                "✨We gained fame and trust that our competitors cant even dream about! \n" +
                "We sell fast food\uD83C\uDF54, healthy food\uD83E\uDD57, drinks\uD83E\uDD64, sweets\uD83C\uDF6D, pastries\uD83E\uDDC1 and anything that can make our costumers happier!(Not everything from our menu is available here). \n" +
                "❤\uFE0F\u200D\uD83E\uDE79Many people choose us because we can provide convenience, quality, taste and more than just fast food!\n" +
                "\uD83E\uDD16We made this bot so our costumers can easily order food from their current location!\n" +
                "Here are some questions that the majority of people ask us:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();


        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("What payment methods are available?");
        button.setCallbackData("pavementEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("When do y'all work?");
        button.setCallbackData("datesEng");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Are your products halal?");
        button.setCallbackData("halyalEng");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Whos is the Niber?");
        button.setCallbackData("nobodyEng");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;


        //aboutus

        //savollar


        //savollar
    }

    public SendMessage aboutRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCC6 Yeati's был открыт XX/XX/XXXX.\n" +
                "Сначала он был не таким популярным, но благодаря большому труду наша команда смогла сделать Yeati's лучшей сетью фастфуда во всей вселенной!\n" +
                "✨Мы получили славу и доверие, о которых наши конкуренты даже мечтать не могут!\n" +
                "Мы продаём фастфуд\uD83C\uDF54, полезную еду\uD83E\uDD57, напитки\uD83E\uDD64,сладости\uD83C\uDF6D, выпечку\uD83E\uDDC1 и всё, что может сделать наших клиентов счастливее! (не всё из нашего меню доступно здесь).\n" +
                "❤\uFE0F\u200D\uD83E\uDE79Многие люди выбирают нас, потому что мы обеспечиваем удобство, качество, вкус и гораздо больше, чем просто фастфуд!\n" +
                "\uD83E\uDD16Мы создали этого бота, чтобы наши клиенты могли легко заказывать еду из своего текущего местоположения!\n" +
                "Вот некоторые вопросы, которые задаёт большинство людей:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Какие виды оплаты доступны?");
        button.setCallbackData("pavementRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Когда вы работаете?");
        button.setCallbackData("datesRus");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Ваша продукция халяльная?");
        button.setCallbackData("halyalRus");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Кто такой Niber?");
        button.setCallbackData("nobodyRus");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage PayUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz hamma to'lov turlarini qabul qilamiz\uD83D\uDCB3. Siz naqd, karta va boshqa usullar bilan buyurtmani to'la olasiz");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("abotusUzb");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage PayEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("We accept all types of payments\uD83D\uDCB3. You can pay for your order with cash, card, or other methods.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuEng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FGo back");
        button.setCallbackData("abotusEng");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage PayRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Мы принимаем все виды оплаты\uD83D\uDCB3. Вы можете оплатить заказ наличными, картой и другими способами.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FНазад");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage workTimeUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Har bitta Yeati's filiali har kuni 5:00dan 23:00gacha ishlaydi.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("abotusUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage workTimeEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Yeati's works everyday from 5am to 11pm.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FGo back");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage workTimeRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Каждый Yeati's работает ежедневно с 5 утра до 11 вечера.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FНазад");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage halyalUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Yeati'sdagi barcha mahsulotlar halol sertifikatiga ega. Lekin bir hillari halol emas");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("abotusUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage halyalEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("A lot of our items are halal. However, some of them aren't");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuEng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FGo back");
        button.setCallbackData("abotusEng");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage halyalRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Многие наши продукты халяльные, но не все");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FНазад");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage niberNibersonUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("The one who brings the Nibering...");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("abotusUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage niberNibersonEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("The one who brings the Nibering...");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuEng");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FGo back");
        button.setCallbackData("abotusEng");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage niberNibersonRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("The one who brings the Nibering...");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FНазад");
        button.setCallbackData("abotusRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //aboutus

    //contact

    public SendMessage contactUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("☎\uFE0FBizning botlarimiz:\n" +
                "⚙\uFE0FMuammolar - @yeatis_support\n" +
                "\uD83D\uDCA1Takliflar va hamkorlik - info@yeatis.nbr\n" +
                "\uD83D\uDCDETelefon raqamimiz- +xxx xxxxxxx\n" +
                "\uD83D\uDD52Biz 9:00-23:00 oralarida javob beramiz");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage contactEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("☎\uFE0F Our contacts:\n" +
                "⚙\uFE0F Issues & support: @yeatis_support\n" +
                "\uD83D\uDCA1 Suggestions & partnership: info@yeatis.nbr\n" +
                "\uD83D\uDCDE Our phone number: +xxx xxxxxxx\n" +
                "\uD83D\uDD52 We reply between 9:00 and 23:00");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage contactRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("☎\uFE0F Наши контакты:\n" +
                "⚙\uFE0F Проблемы и поддержка: @yeatis_support\n" +
                "\uD83D\uDCA1 Предложения и сотрудничество: info@yeatis.nbr\n" +
                "\uD83D\uDCDE Наш номер телефона: +xxx xxxxxxx\n" +
                "\uD83D\uDD52 Мы отвечаем с 9:00 до 23:00");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FМеню");
        button.setCallbackData("menuRus");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //contact

    //sharhlar

    public SendMessage feedUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz haqimizda fikringizni yozing");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage rateUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Bizni 1-5gacha baholang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⭐\uFE0F⭐\uFE0F⭐\uFE0F⭐\uFE0F⭐\uFE0F");
        button.setCallbackData("fiveStarUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⭐\uFE0F⭐\uFE0F⭐\uFE0F⭐\uFE0F");
        button.setCallbackData("fourStarUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⭐\uFE0F⭐\uFE0F⭐\uFE0F");
        button.setCallbackData("threeStarUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⭐\uFE0F⭐\uFE0F");
        button.setCallbackData("twoStarUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⭐\uFE0F");
        button.setCallbackData("oneStarUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FKeyinroq");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage OneStarUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Voy... biz bunchalik ham yomon emasmizdir... shekilli...");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage TwoStarUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Noqulayliklar uchun uzr, o‘zimizni yaxshilashga harakat qilamiz.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ThreeStarUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Noqulayliklar uchun uzr, o‘zimizni yaxshilashga harakat qilamiz.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage FourStarUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Bahoyingiz uchun rahmat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage FiveStarUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Bahoyingiz uchun rahmat! Chegirma olish uchun “FIVEFIVE” promokodini ishlating");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FMenu");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // sharhlar

    public SendMessage ZakazUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Zakaz qiladigan mahsulotlarni tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("↩\uFE0FOrqaga");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage ChooseUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("fast-foodingizni tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Bekon Burger");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("ChizBurger");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Vegan Burger");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Lavash");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Tovuq va bekonli fri");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qovurilgan tovuq");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FZakaz");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("↩\uFE0FAtmen");
        button.setCallbackData("menuUzb");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
}