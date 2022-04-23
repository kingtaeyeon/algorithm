package unit5_递归和树.part1_基础知识;

import java.util.List;

public class NTreeNode {
    int val;
    List<NTreeNode> nodes;

    public NTreeNode() {
    }

    public NTreeNode(int val, List<NTreeNode> nodes) {
        this.val = val;
        this.nodes = nodes;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<NTreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<NTreeNode> nodes) {
        this.nodes = nodes;
    }
}
