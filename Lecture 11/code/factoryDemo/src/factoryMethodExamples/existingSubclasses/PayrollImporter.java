package factoryMethodExamples.existingSubclasses;

import java.util.List;

public class PayrollImporter extends FileImporter {

    @Override
    protected Parser createParser() {
        return new PayrollCsvParser();
    }

    @Override
    protected void validate(List<String[]> records) {
        super.validate(records);

        if (records.stream().anyMatch(record -> Integer.parseInt(record[1]) <= 0)) {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }
}
