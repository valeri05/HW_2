public class Main {
    public static void main(String[] args) {

        int balance = 100; // текущий счет клиента
        int bonus = 0; // каждые 100 рублей пополнения = 1 бонусный рубль
        int replenishment = 300; // пополнение в рублях

        if (replenishment >= 1000) {
            int bonusBalance = (bonus + (replenishment / 100));
            int totalBalance = (balance + replenishment);

            System.out.println("Баланс:");
            System.out.println(balance + " руб.");
            System.out.println("Пополнение:");
            System.out.println(replenishment + " руб.");
            System.out.println("Баланс бонусов:");
            System.out.println(bonusBalance + " бонусных руб.");
            System.out.println("Итого на балансе:");
            System.out.println(totalBalance + " руб.");
        } else {

            int bonusBalance = (bonus);
            int totalBalance = (balance + replenishment);

            System.out.println("Баланс:");
            System.out.println(balance + " руб.");
            System.out.println("Пополнение:");
            System.out.println(replenishment + " руб.");
            System.out.println("Баланс бонусов:");
            System.out.println(bonusBalance + " бонусных руб.");
            System.out.println("Итого на балансе:");
            System.out.println(totalBalance + " руб.");

        }
    }
}