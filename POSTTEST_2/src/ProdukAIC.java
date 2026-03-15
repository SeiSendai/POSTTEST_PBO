class produkAIC {
    protected String productName;
    private String usage;
    private int amount;

    public produkAIC(String productName, String usage, int amount) {
        this.productName = productName;
        this.usage = usage;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public String getUsage() {
        return usage;
    }

    public int getAmount() {
        return amount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Jumlah tidak boleh negatif!");
        }
    }
}