package factoryMethodExamples.existingSubclasses;

import java.util.List;

public class InventoryImporter extends FileImporter {

    @Override
    protected Parser createParser() {
        return new InventoryPipeParser();
    }

    @Override
    protected void validate(List<String[]> records) {
        super.validate(records);

        // Zero stock is valid, negative stock is not.
        if (records.stream().anyMatch(record -> Integer.parseInt(record[1]) < 0)) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }
}
