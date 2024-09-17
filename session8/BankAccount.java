package ro.siit.session8;

public class BankAccount {
    private double amount;
    private final String pin = "7210";

    public void addMoney(double amount, String pin) {
        if(pin.equals(this.pin) || pin.equals(SaltBank.getBankPin())) {
            this.amount += Math.max(0, amount);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
