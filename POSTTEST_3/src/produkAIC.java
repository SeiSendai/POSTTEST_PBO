public class produkAIC {
    protected String productName;
    protected String usage;
    protected int amount;

    public produkAIC(String productName, String usage, int amount) {
        this.productName = productName;
        this.usage = usage;
        this.amount = amount;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getUsage() { return usage; }
    public void setUsage(String usage) { this.usage = usage; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public void displayInfo() {
        System.out.print(productName + " | " + usage + " | " + amount + " Qty");
    }
}