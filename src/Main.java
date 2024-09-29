class Main {
    public static void main(String[] args) {
        PersonalAccount Aslan = new PersonalAccount(526, "Aslan Tabaldiev");
        Aslan.deposit(50000);
        Aslan.withdrawal(100000);
        Aslan.transactionHistory();
        System.out.println(Aslan.getBalance());
        System.out.println(Aslan.getAccountNumber());
        System.out.println(Aslan.getAccountHolder());
    }
}