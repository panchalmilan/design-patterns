package visitor.problem;

public interface HtmlNode {
    void hightlight();
    // adding syntax highlighting for all html nodes
    // this is an operation
}

/**
 * PROBLEM: let's say in future we want to to add new operation to extract text from HtmlNode
 * <heading>Test</heading> -- Test here
 * This will be a new operation
 *
 *
 * SOLUTION - add new method in HtmlNode as
 *      String plainText();
 * then all implementations of HtmlNode will have to implement this method!
 *
 * VIOLATES - OCP
 */