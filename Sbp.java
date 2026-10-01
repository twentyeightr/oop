public class Sbp extends Transaction {

    private String phone_number;
    private String rec_bank;
    private boolean sbp_status;

    public Sbp(String card_number, String bank_name, double balance,
            String name, String currency, double commission,
            String phone_number, String rec_bank, boolean sbp_status) {
        super(card_number, bank_name, balance, name, currency, commission);
        this.phone_number = phone_number;
        this.rec_bank = rec_bank;
        this.sbp_status = sbp_status;
    }

    public void send_by_phone(double sum) {
        if (!sbp_status) {
            System.out.println("СБП отключена. Перевод невозможен.");
            return;
        }

        sum = sum * (1.0 + get_commission());
        if (sum <= get_balance()) {
            set_balance(get_balance() - sum);
            System.out.println("Перевод по СБП на номер " + phone_number + " выполнен.");
        } else {
            System.out.println("Недостаточно средств для перевода по СБП.");
        }
    }

    public void check_rec_bank() {
        System.out.println(rec_bank);
    }

    public void check_status() {
        if (sbp_status) {
            System.out.println("СБП подключена.");
        } else {
            System.out.println("СБП отключена.");
        }
    }

    public String get_phone_number() {
        return phone_number;
    }

    public void set_phone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String get_rec_bank() {
        return rec_bank;
    }

    public void set_rec_bank(String rec_bank) {
        this.rec_bank = rec_bank;
    }

    public boolean get_sbp_status() {
        return sbp_status;
    }

    public void set_sbp_status(boolean sbp_status) {
        this.sbp_status = sbp_status;
    }
}