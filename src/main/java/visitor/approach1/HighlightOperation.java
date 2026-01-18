package visitor.approach1;

public class HighlightOperation implements Operation{

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("highlighting anchor node");
    }

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlighting heading node");
    }
}
