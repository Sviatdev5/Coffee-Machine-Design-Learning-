class CoinPayment extends Payment {
    public CoinPayment(double amount) { super(amount); }
    @Override
    public boolean authorize() {
        System.out.println("[Payment] Coins validated: $" + amount);
        return true;
    }
}
