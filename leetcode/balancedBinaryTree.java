public class balanceBinaryTree{


  /*
    Given a binary tree , determine if it is height-balanced
    A height-balanced banary tree is defined as a binary tree in which the depth of the two
    subtrees of every node never differ by more than 1
  */
  public boolean isBalanced(TreeNode root){
    return maxDepth(root) != -1;
  }

  private int maxDepth(TreeNode root){
    if(root ==null)
      return 0;

    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    if(left == -1 || right == -1 || Math.abs(left-right)>1){
      return -1;
    }
    return Math.abs(left-right)+1;
  }

}
