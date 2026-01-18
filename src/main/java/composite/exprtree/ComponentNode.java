package composite.exprtree;

public abstract class ComponentNode {

    /** This method is a no-op in this abstract base class. */
    public int item() {
        throw new UnsupportedOperationException("ComponentNode::item() called improperly");
    }

    /** Return the right child (returns 0 if called directly). */
    public ComponentNode right() {
        return null;
    }

    /** Return the left child (returns 0 if called directly). */
    public ComponentNode left() {
        return null;
    }

    /**
     * Accept a visitor to perform some action on the node's item
     * completely arbitary visitor template
     * (throws an exception if called directly)
     */
//    void accept(Visitor visitor) {
//        throw new UnsupportedOperationException("ComponentNode::item() called improperly");
//    }

}
