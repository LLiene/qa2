import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstHomework {

    @Test
    public void loanAmountCheck() {


        double loan = 30000.00;
        double firstPayment = 0.1 * loan;
        double secondPayment = 0.08 * (loan - firstPayment);
        double thirdPayment = 0.06 * (loan - (firstPayment) - (secondPayment));
        double totalPay = loan + firstPayment + secondPayment + thirdPayment;
        String actualPayFinal = String.format("%.2f", totalPay);
        String expectedPayFinal = String.format("%.2f", 36650.40);


        //System.out.println("First payment " + firstPayment);
        // System.out.println("Second payment " + secondPayment);
        // System.out.println("Third payment " + thirdPayment);
        // System.out.println(totalPayFinal);


        Assertions.assertEquals(expectedPayFinal, actualPayFinal, "Do not match");


    }

}
