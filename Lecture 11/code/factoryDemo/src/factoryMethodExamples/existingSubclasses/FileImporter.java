package factoryMethodExamples.existingSubclasses;

import java.util.List;

public abstract class FileImporter {

    // The shared workflow. final: subclasses change steps, not the order.
    public final void importContent(String content) {
        Parser parser = createParser();
        List<String[]> records = parser.parse(content);
        validate(records);
        save(records);
    }

    // Factory method
    protected abstract Parser createParser();

    // Common check. Subclasses can add their own rules.
    protected void validate(List<String[]> records) {
        if (records.stream().anyMatch(record -> record.length != 2)) {
            throw new IllegalArgumentException("Each record needs 2 fields");
        }
    }

    private void save(List<String[]> records) {
        System.out.println("Saved " + records.size() + " records");
    }
}
