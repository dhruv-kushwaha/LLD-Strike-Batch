package factoryMethodExamples.existingSubclasses;

import java.util.List;

public class InventoryPipeParser implements Parser {

    // Format: sku|quantity
    @Override
    public List<String[]> parse(String content) {
        return content.lines().map(line -> line.split("\\|")).toList();
    }
}
