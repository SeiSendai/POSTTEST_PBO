class Consumable extends produkAIC {
    private String expirationDate;

    public Consumable(String name, int amount, String exp) {
        super(name, "Consumable", amount);
        this.expirationDate = exp;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Exp: " + expirationDate);
    }
}