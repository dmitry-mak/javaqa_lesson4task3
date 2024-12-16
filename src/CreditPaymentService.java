public class CreditPaymentService {

    public int calculate(double creditAmount, int yearsNumber, double annualRate) {

        double paymentAmount = 0;

        double monthlyRate = annualRate / 100 / 12;
        int months = yearsNumber * 12;

        double temporarySum = Math.pow((1 + monthlyRate), months);
        paymentAmount = (creditAmount * monthlyRate * temporarySum) / (temporarySum - 1);

        return (int) paymentAmount;
    }
}
