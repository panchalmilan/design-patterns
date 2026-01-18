package visitor.approach1;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    // extensibility!
    public void execute(Operation operation) {
        for(HtmlNode node: nodes) {
            node.execute(operation);
        }
    }

}
