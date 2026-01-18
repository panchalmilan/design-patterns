package visitor.approach1;

public class PlainTextOperation implements Operation{

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("plaintext anchor node");
    }

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("plaintext heading node");
    }
}
