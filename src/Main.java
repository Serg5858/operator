public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int additionOfAccount = 1100;
        int bonus = additionOfAccount / 100;
        int amount = currentAccount + additionOfAccount + bonus;
        if (additionOfAccount > 1000) {
            System.out.println(" Итоговый счет :" + amount + " из них бонус :" + bonus);
        } else {
            System.out.println("Итоговый счет :" + (currentAccount + additionOfAccount));
        }
    }
}



