package visitor.approach1;

public interface Operation {
    void apply(AnchorNode anchorNode);
    void apply(HeadingNode headingNode);
}
