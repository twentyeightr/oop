public class Card {

    private String card_number;
    private String bank_name;
    private double balance;

    public Card(String card_number, String bank_name, double balance) {
        this.card_number = card_number;
        this.bank_name = bank_name;
        this.balance = balance;
    }

    public void show_bank_name() {
        System.out.println(bank_name);
    }

    public void show_card_number() {
        System.out.println(card_number);
    }

    public void show_balance() {
        System.out.println(balance);
    }

    public String get_card_number() {
        return card_number;
    }

    public void set_card_number(String card_number) {
        this.card_number = card_number;
    }

    public String get_bank_name() {
        return bank_name;
    }

    public void set_bank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public double get_balance() {
        return balance;
    }

    public void set_balance(double balance) {
        this.balance = balance;
    }
}