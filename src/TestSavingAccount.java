public class TestSavingAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("savingsBalance1 is : "+saver1.getSavingsBalance());
        System.out.println("savingsBalance2 is : "+saver2.getSavingsBalance());


        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Other person savingsBalance1 is : "+saver1.getSavingsBalance());
        System.out.println("Other person savingsBalance2 is : "+saver2.getSavingsBalance());
    }
}
