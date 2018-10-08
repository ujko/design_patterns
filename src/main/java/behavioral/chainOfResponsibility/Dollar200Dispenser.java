package behavioral.chainOfResponsibility;

public class Dollar200Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    public void dispense(Currency currency) {
        int amnt = currency.getAmount();
        if (amnt >= 20) {
            int num = amnt / 20;
            int remainder = amnt % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
