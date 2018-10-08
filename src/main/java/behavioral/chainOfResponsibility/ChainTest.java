package behavioral.chainOfResponsibility;

import java.util.Scanner;

public class ChainTest {

    private DispenseChain c1;

    public ChainTest() {
        this.c1 = new Dollar500Dispenser();
        DispenseChain c2 = new Dollar200Dispenser();
        DispenseChain c3 = new Dollar100Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainTest chainTest = new ChainTest();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be multiple  of 10 s. ");
                return;
            }
            chainTest.c1.dispense(new Currency(amount));
        }
    }
}
