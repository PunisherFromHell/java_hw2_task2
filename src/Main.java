public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int amount_on_account = 100;
        int add_money = 110;
        int bonus = add_money / 100;
        if (add_money < 1000) {
            System.out.println(amount_on_account + add_money+"   you have no bonus");
        } else {
            System.out.println(amount_on_account +
                    add_money + bonus+"   your bonus-"+bonus);
        }

    }
}