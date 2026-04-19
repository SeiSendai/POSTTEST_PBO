class Material extends produkAIC {
    private String materialType;

    public Material(String name, int amount, String type) {
        super(name, "Material", amount);
        this.materialType = type;
    }

    @Override
    public void detailCategory() {
        System.out.println("Kategori: Bahan Baku Produksi");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Type: " + materialType);
    }
}