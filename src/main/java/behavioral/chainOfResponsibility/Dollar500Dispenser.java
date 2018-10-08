package behavioral.chainOfResponsibility;

public class Dollar500Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    public void dispense(Currency currency) {
        int amnt = currency.getAmount();
        if (amnt >= 50) {
            int num = amnt / 50;
            int remainder = amnt % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
