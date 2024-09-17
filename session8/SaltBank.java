package ro.siit.session8;

public class SaltBank {
    private final static String bankPin = "0000";
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // account.amount = 100;
        account.addMoney(100, SaltBank.bankPin);
        System.out.println(account);

        Thief thief = new Thief();
        thief.aquireAccountAccess(account);

        System.out.println(account);
    }

    public static String getBankPin() {
        return bankPin;
    }
}
