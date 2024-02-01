public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int amountOnAccount = 100;
        int addMoney = 110;
        int bonus = addMoney / 100;
        if (addMoney < 1000) {
            System.out.println(amountOnAccount + addMoney+"   you have no bonus");
        } else {
            System.out.println(amountOnAccount +
                    addMoney + bonus+"   your bonus-"+bonus);
        }

    }
}