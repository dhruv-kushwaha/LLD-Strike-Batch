package factoryMethodExamples.existingSubclasses;

import java.util.List;

public class PayrollCsvParser implements Parser {

    // Format: employeeId,salary
    @Override
    public List<String[]> parse(String content) {
        return content.lines().map(line -> line.split(",")).toList();
    }
}
