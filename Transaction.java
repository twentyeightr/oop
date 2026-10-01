public class Transaction extends Card {

    private String name;
    private String currency;
    private double commission;

    public Transaction(String card_number, String bank_name, double balance,
            String name, String currency, double commission) {

        super(card_number, bank_name, balance);

        this.name = name;
        this.currency = currency;
        this.commission = commission;
    }

    public void owner() {
        System.out.println(name);
    }

    public void pay(double sum) {
        sum = sum * (1.0 + commission);
        if (sum <= get_balance()) {
            set_balance(get_balance() - sum);
            System.out.println("Оплата прошла.");
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    public void currency() {
        System.out.println(currency);
    }

    public String get_owner_name() {
        return name;
    }

    public void set_owner_name(String name) {
        this.name = name;
    }

    public String get_currency() {
        return currency;
    }

    public void set_currency(String currency) {
        this.currency = currency;
    }

    public double get_commission() {
        return commission;
    }

    public void set_commission(double commission) {
        this.commission = commission;
    }
}