class CardPayment extends Payment {
    public CardPayment(double amount) { super(amount); }
    @Override
    public boolean authorize() {
        System.out.println("[Payment] Connecting to Bank API... Authorized $" + amount);
        return true;
    }
}
