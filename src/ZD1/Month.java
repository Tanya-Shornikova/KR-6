package ZD1;

public enum Month {
    JANUARY("1.Январь"),
    FEBRUARY("2.Февраль"),
    MARCH("3.Матр"),
    APRIL("4.Апрель"),
    MAY("5.Май"),
    JUNE("6.Июнь"),
    JULY("7.Июль"),
    AUGUST("8.Август"),
    SEPTEMBER("9.Сентябрь"),
    OCTOBER("10.Оксябрь"),
    NOVEMBER("11.Ноябрь"),
    DECEMBER("12.Декабрь");

    private final String name;

    Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}



