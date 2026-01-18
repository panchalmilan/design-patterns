package visitor.problem;

public class HeadingNode implements HtmlNode {

    @Override
    public void hightlight() {
        System.out.println("highlight heading node");
    }
}
