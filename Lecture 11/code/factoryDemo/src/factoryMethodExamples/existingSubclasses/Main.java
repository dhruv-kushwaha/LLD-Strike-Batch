package factoryMethodExamples.existingSubclasses;

public class Main {

    public static void main(String[] args) {

        new PayrollImporter().importContent("E1,5000\nE2,6000");
        new InventoryImporter().importContent("SKU1|10\nSKU2|0\nSKU3|4");

        try {
            new PayrollImporter().importContent("E3,-1");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
