public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long credit1years = service.calculate(1_000_000, 9.99, 1);
        System.out.println(credit1years);

        long credit2years = service.calculate(1_000_000, 9.99, 2);
        System.out.println(credit2years);

        long credit3years = service.calculate(1_000_000, 9.99, 3);
        System.out.println(credit3years);
        }
    }
