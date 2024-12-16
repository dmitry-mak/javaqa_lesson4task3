public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println(String.format("Ежемесячный платеж за 1 год: %d", service.calculate(1000000, 1, 9.99)));
        System.out.println(String.format("Ежемесячный платеж за 2 года: %d", service.calculate(1000000, 2, 9.99)));
        System.out.println(String.format("Ежемесячный платеж за 3 года: %d", service.calculate(1000000, 3, 9.99)));

    }
}