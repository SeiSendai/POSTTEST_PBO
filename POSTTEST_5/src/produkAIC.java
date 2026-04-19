public abstract class produkAIC {
    protected String productName;
    protected String usage;
    protected int amount;

    public produkAIC(String productName, String usage, int amount) {
        this.productName = productName;
        this.usage = usage;
        this.amount = amount;
    }


    public abstract void detailCategory();

    public void displayInfo() {
        System.out.print(productName + " | " + usage + " | " + amount + " Qty");
    }

    public void restock(int additionalAmount) {
        this.amount += additionalAmount;
    }

    public String getProductName() { return productName; }
}