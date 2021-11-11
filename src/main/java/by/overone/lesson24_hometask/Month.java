package by.overone.lesson24_hometask;

public enum Month {
    JANUARY(21,30), FEBRUARY(20,29), MARCH(21,31) ,APRIL(21,30),MAY(22,31),JUNE(22,30), JULY(23,31), AUGUST(24,31),
    SEPTEMBER(23,30), NOVEMBER(22,30), OCTOBER(23,31), DECEMBER(22,31);
    int dayToTransfer; // дата перехода даты знака
    int days;          // макс количество дней

    Month(int dayToTransfer, int days) {
        this.dayToTransfer = dayToTransfer;
        this.days = days;
    }
    // 21 марта – 20 апреля Овен
    // 21 апреля – 21 мая Телец
    // 22 мая – 21 июня Близнецы
    // 22 июня – 22 июля Рак
    // 23 июля – 23 августа Лев
    // 24 августа – 22 сентября Дева
    // 23 сентября – 22 октября Весы
    // 23 октября – 22 ноября Скорпион
    // 22 ноября – 21 декабря Стрелец
    // 22 декабря – 20 января Козерог
    // 21 января – 19 февраля Водолей
    // 20 февраля – 20 марта Рыбы



}
