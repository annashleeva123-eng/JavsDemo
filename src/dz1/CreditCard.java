package dz1;

public class CreditCard {
    String numberCard;
    double balance;

    public CreditCard(String numberCard, double balance) {
        this.numberCard = numberCard;
        this.balance = balance;
    }

    //зачисление на карту
    public void plusCash(double sum) {
        balance += sum;
        System.out.println(sum + " зачислено на карту " + numberCard);
    }

    //снятие с карточки
    public void remove(double sum) {
        balance -= sum;
        System.out.println(sum + " снято с карты " + numberCard);
    }

    //вывод инфо
    public void info() {
        System.out.println("Карта: " + numberCard + ", баланс: " + balance);
    }
}
