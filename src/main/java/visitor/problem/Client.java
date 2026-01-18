package visitor.problem;

public class Client {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        // operation
        document.highlight();
    }
}
