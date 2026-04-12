class Rarity extends produkAIC {
    private String rarityLevel;

    public Rarity(String name, int amount, String level) {
        super(name, "Special Item", amount);
        this.rarityLevel = level;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Rarity: [" + rarityLevel.toUpperCase() + "]");
    }
}