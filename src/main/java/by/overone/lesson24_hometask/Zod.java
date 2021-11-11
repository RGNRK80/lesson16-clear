package by.overone.lesson24_hometask;

public enum Zod {
    ARIES("https://www.elle.ru/astro/aries/day/"),
    TAURUS("https://www.elle.ru/astro/taurus/day/"),
    GEMINI("https://www.elle.ru/astro/gemini/day/"),
    CANCER("https://www.elle.ru/astro/cancer/day/"),
    LEO("https://www.elle.ru/astro/leo/day/"),
    VIRGO("https://www.elle.ru/astro/virgo/day/"),
    LIBRA("https://www.elle.ru/astro/libra/day/"),
    SCORPIO("https://www.elle.ru/astro/scorpio/day/"),
    SAGITTARIUS("https://www.elle.ru/astro/SAGITTARIUS/day/"),
    CAPRICORN("https://www.elle.ru/astro/CAPRICORN/day/"),
    AQUARIUS("https://www.elle.ru/astro/AQUARIUS/day/"),
    PISCES("https://www.elle.ru/astro/PISCES/day/");

    //http://img.ignio.com/r/export/utf/xml/daily/com.xml

    String goroskop;

    Zod(String goroskop) {
        this.goroskop = goroskop;
    }
}


