package com.example.TgBotDz.service;

/**
 * Интерфейс чат бота
 */

public interface Bot {

    /**
     * Запуск чат бота
     */
    void botStart();

    /**
     * Инитициализация чат бота
     */
    void botInitialization();

    /**
     * Отправить сообщение пользователю
     */
    void botSendMessage();

    /**
     * Получить сообщение от пользователя
     * @return
     */
    String botReadMessage();
}
