package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class YeatisBot extends TelegramLongPollingBot {

    Map<Long, String> state = new HashMap<>();

    int promocount = 0;
    int reveving = 0;
    YeatisService yetis = new YeatisService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            String firstName = update.getMessage().getFrom().getFirstName();
            String lastName = update.getMessage().getFrom().getLastName();


            System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nMessage: " + message);

            if (message.equals("/start")) {
                try {
                    execute(yetis.greeting(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //promocode

            else if (message.equals("MANESHAKMAN") && promocount > 0) {
                try {
                    execute(yetis.PromoShakman(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (!message.equals("MANESHAKMAN") && promocount > 0) {
                try {
                    execute(yetis.InvalidPromoUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //promocode

            //rating

            else if (state.getOrDefault(chatId, "").equals("fikr") && reveving > 0) {
                try {
                    execute(yetis.rateUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //rating

            //til
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId1 = callbackQuery.getMessage().getChatId();

            Integer messageId = callbackQuery.getMessage().getMessageId();

            //language

            if (data.equals("uzb")) {
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
                    execute(yetis.cityUzb(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chLanUzb")) {
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
                    execute(yetis.changeLanguageUzb(chatId1));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //language

            //city

            if (data.equals("cityOfNibrU")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId1);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(null);
                try {
                    execute(editMessageReplyMarkup);
                    if (data.equals("cityOfNibrU")) {
                        try {
                            execute(yetis.cityUzbShort(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.cityUzbShort(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    //city

                    //menu

                    if (data.equals("cityE")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.MenuUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    if (data.equals("menuUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.MenuUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        promocount = 0;
                        reveving = 0;
                    }

                    //menu

                    //contact

                    if (data.equals("aleuUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.contactUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    //contact

                    //promocode

                    if (data.equals("promoUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.PromoUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        promocount++;
                    }
                    if (data.equals("AgainUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.PromoUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        promocount++;
                    }

                    //promocode

                    //rating

                    if (data.equals("revUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                            state.put(chatId1, "fikr");
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.feedUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        reveving++;
                    }


                    if (data.equals("oneStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.OneStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("twoStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.TwoStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("threeStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.ThreeStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("fourStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.FourStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("FiveStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.FiveStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    //rating

                    //aboutus

                    if (data.equals("abotusUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.aboutUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }


                    if (data.equals("pavementUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.PayUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("datesUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.workTimeUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("halyalUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.halyalUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("nobodyUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.niberNibersonUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }


                    //aboutus

                    //sharhlar



                    if (data.equals("revUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                            state.put(chatId1, "fikr");
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.feedUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        reveving++;
                    }
//nom

                    if (data.equals("oneStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.OneStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("twoStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.TwoStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("threeStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.ThreeStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("fourStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.FourStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (data.equals("FiveStarUzb")) {
                        EditMessageReplyMarkup editMessageReplyMarkup1 = new EditMessageReplyMarkup();
                        editMessageReplyMarkup.setChatId(chatId1);
                        editMessageReplyMarkup.setMessageId(messageId);
                        editMessageReplyMarkup.setReplyMarkup(null);
                        try {
                            execute(editMessageReplyMarkup);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            execute(yetis.FiveStarUzb(chatId1));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }


                }
                catch (Exception e){

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

