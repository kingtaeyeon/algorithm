package unit5_递归和树;

import java.util.List;

public class NTreeNode {
   public int val;
    public  List<NTreeNode> children;

    NTreeNode(int val) {
        this.val = val;
    }

    public NTreeNode(int _val, List<NTreeNode> _children) {
        val = _val;
        children = _children;
    }
}
