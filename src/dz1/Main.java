package dz1;

public class Main {
    public static void main(String[] args) {

        // Создаем три кредитные карточки
        CreditCard card1 = new CreditCard("12340000", 1000.0);
        CreditCard card2 = new CreditCard("5678232", 25000.0);
        CreditCard card3 = new CreditCard("09875467", 500000.0);

        // Положите деньги на первые две
        card1.plusCash(555);
        card2.plusCash(1500);

        // Снимите с третьей
        card3.remove(2000);

        // Выведите текущее состояние всех карточек
        card1.info();
        card2.info();
        card3.info();
    }
}
