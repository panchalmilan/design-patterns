package visitor.problem;

public class AnchorNode implements HtmlNode {
    @Override
    public void hightlight() {
        System.out.println("highlight anchor node");
    }
}
