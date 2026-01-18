package visitor.approach1;

public class Client {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        // operation
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
