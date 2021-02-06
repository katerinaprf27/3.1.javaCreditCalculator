public class CreditPaymentService {
    public long calculate(double summacredit, double bankProcent, long periodCreditInYears) {
        long peroidCreditInMonths = periodCreditInYears * 12;
        double stavka = bankProcent / 100 / 12;
        double monthlyPayment = summacredit * ((stavka / (1 - (1 / Math.pow(1 + stavka, peroidCreditInMonths)))));
        long result = Math.round(monthlyPayment);
        return result;
    }
}
