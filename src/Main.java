public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных и
        // параметров программы:
        int ticket = 1450;//одну для хранения стоимости билета
        int rub = 20;//другую для хранения количества рублей для одной бонусной милли
        int bonus=1450/20;

        System.out.println("Ваш бонус от стоимости билета, в милях:");
        System.out.println(ticket / rub);
        System.out.println("Мили");

    }
}
