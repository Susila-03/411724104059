public class BinaryTreeEg {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
        public void preorder(Node root){
            if(root==null)
                return;
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if(root==null)
                return;
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        public void postorder(Node root){
            if(root==null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }
        public int countNodes(Node root){
            if(root==null)
                return 0;
            return 1+countNodes(root.left)+countNodes(root.right);
        }
        public int countleaves(Node root){
            if(root==null)
                return 0;
            if(root.left==null && root.right==null)
                return 1;
            return countleaves(root.left)+countleaves(root.right);
        }
        public static void main(String[] args) {
            BinaryTreeEg bt = new BinaryTreeEg();
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            System.out.println(" Binary Tree Created");
            System.out.print("PreOrder Traversal:");
            bt.preorder(root);
            System.out.println();
            System.out.print("InOrder Traversal:");
            bt.inorder(root);
            System.out.println();
            System.out.print("PostOrder Traversal:");
            bt.postorder(root);
            System.out.println();
             System.out.print("Count :");
            bt.preorder(root);
            System.out.println();
    }
}