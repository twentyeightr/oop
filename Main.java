public class Main {
    public static void main(String[] args) {

        Sbp sbp = new Sbp(
                "0123 4567 8900 2828",
                "Банк",
                50.0,
                "Имя Фамилия",
                "RUB",
                0.05,
                "+79123456789",
                "Банк2",
                true);

        System.out.println("## Карта");
        sbp.show_bank_name();
        sbp.show_card_number();
        sbp.show_balance();

        System.out.println("\n## Транзакция");
        sbp.owner();
        sbp.currency();
        System.out.println("Комиссия: " + sbp.get_commission());

        System.out.println("\n## СБП");
        sbp.check_rec_bank();
        sbp.check_status();
        System.out.println("Телефон: " + sbp.get_phone_number());

        System.out.println("\n## СБП перевод");
        sbp.send_by_phone(10000);
        sbp.show_balance();

        System.out.println("\n## Оплата");
        sbp.pay(5.5);
        sbp.show_balance();

        System.out.println("\n## Изменение данных");
        sbp.set_phone_number("+79876543210");
        sbp.set_sbp_status(false);
        sbp.set_rec_bank("Банк3");
        sbp.set_owner_name("Новое Имя");
        sbp.set_currency("USD");
        sbp.set_commission(0.10);
        sbp.set_card_number("0123 0123 0000 0321");
        sbp.set_bank_name("Новый Банк");

        System.out.println("Новый номер: " + sbp.get_phone_number());
        System.out.println("Новый банк получателя: " + sbp.get_rec_bank());
        System.out.println("Новый владелец: " + sbp.get_owner_name());
        System.out.println("Новая валюта: " + sbp.get_currency());
        System.out.println("Новая комиссия: " + sbp.get_commission());
        System.out.println("Новый номер карты: " + sbp.get_card_number());
        System.out.println("Новый банк: " + sbp.get_bank_name());

        sbp.check_status();

        System.out.println("\n## Данные после изменений");
        sbp.show_bank_name();
        sbp.show_card_number();
        sbp.show_balance();
        sbp.owner();
        sbp.currency();
    }
}