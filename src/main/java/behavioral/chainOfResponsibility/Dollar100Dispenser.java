package behavioral.chainOfResponsibility;

public class Dollar100Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    public void dispense(Currency currency) {
        int amnt = currency.getAmount();
        if (amnt >= 10) {
            int num = amnt / 10;
            int remainder = amnt % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
