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
    public SendMessage cityRus(Long chatId) {
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
    public SendMessage cityRusShort(Long chatId) {
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
        return sendMessage;
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
        button.setText("\uD83D\uDCBCBizga qo'shiling");
        button.setCallbackData("jobUzb");
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
    public SendMessage MenuRus(Long chatId) {
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
        return sendMessage;
    }


    //menu

    //sharhlar
    public SendMessage FeedbackUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("baholang 0-5 gacha");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton btn1 = new InlineKeyboardButton("⭐");
        btn1.setCallbackData("OneStarUzb");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton("⭐⭐");
        btn2.setCallbackData("TwoStarUzb");
        row1.add(btn2);

        InlineKeyboardButton btn3 = new InlineKeyboardButton("⭐⭐⭐");
        btn3.setCallbackData("ThreeStarUzb");
        row1.add(btn3);

        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();

        InlineKeyboardButton btn4 = new InlineKeyboardButton("⭐⭐⭐⭐");
        btn4.setCallbackData("FourStarUzb");
        row2.add(btn4);

        InlineKeyboardButton btn5 = new InlineKeyboardButton("⭐⭐⭐⭐⭐");
        btn5.setCallbackData("FiveStarUzb");
        row2.add(btn5);



        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();

        InlineKeyboardButton btn6 = new InlineKeyboardButton("keyinroq");
        btn6.setCallbackData("sixeStarUzb");
        row3.add(btn6);

        rowList.add(row3);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;

    }

    public SendMessage OneRatingUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Voy, biz unchalik ham yomon emasmiz shekilli…");
        return sendMessage;
    }

    public SendMessage TwoRatingUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Noqulaylik uchun uzr, biz o‘zimizni yaxshilashga harakat qilamiz");
        return sendMessage;
    }

    public SendMessage ThreeRatingUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Noqulaylik uchun uzr, biz o‘zimizni yaxshilashga harakat qilamiz");
        return sendMessage;
    }

    public SendMessage FourRatingUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Baholashingiz uchun rahmat!");
        return sendMessage;
    }

//    public SendMessage FiveRatingUzb(Long chatId) {
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId(chatId);
//        sendMessage.setText("Baholashingiz uchun rahmat! Chegirmadan foydalanish uchun ‘FIVEFIVE’ promo-kodini ishlating.");
//        return sendMessage;
//    }

    public SendMessage SixRatingUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Baholashingiz uchun rahmat! Chegirmadan foydalanish uchun ‘FIVEFIVE’ promo-kodini ishlating.");
        return sendMessage;
    }



    //sharhlar
}
