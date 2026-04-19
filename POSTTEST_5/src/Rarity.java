class Rarity extends produkAIC implements Dijiang {
    private String rarityLevel;

    public Rarity(String name, int amount, String level) {
        super(name, "Special Item", amount);
        this.rarityLevel = level;
    }

    @Override
    public void detailCategory() {
        System.out.println("Kategori: Item Koleksi Langka");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Rarity: [" + rarityLevel.toUpperCase() + "]");
    }

    @Override
    public void checkAvailability() {
        String status = (amount > 0) ? "Tersedia" : "Kosong";
        System.out.println("Status Ketersediaan: " + status);
    }

    @Override
    public void updateStatus() {
        System.out.println("Log: Status item '" + productName + "' telah diperbarui di Database.");
    }
}