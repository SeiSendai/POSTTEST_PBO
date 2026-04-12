public class produkAIC {
    protected String productName;
    protected String usage;
    protected int amount;

    public produkAIC(String productName, String usage, int amount) {
        this.productName = productName;
        this.usage = usage;
        this.amount = amount;
    }

    public void restock(int additionalAmount) {
        this.amount += additionalAmount;
        System.out.println("Stok " + productName + " berhasil ditambah +" + additionalAmount);
    }

    public void restock(int additionalAmount, String newUsage) {
        this.amount += additionalAmount;
        this.usage = newUsage;
        System.out.println("Stok " + productName + " ditambah dan status diubah menjadi: " + newUsage);
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getAmount() { return amount; }

    public void displayInfo() {
        System.out.print(productName + " | " + usage + " | " + amount + " Qty");
    }
}