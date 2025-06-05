class Node{
    String key;
    Node left,right;
    public Node(String item){
        key = item;
        left=right=null;
    }
}
class TreeProject{
    Node root;
    void traverseTree(Node node){
        if(node!=null){
            traverseTree(node.left);
            System.out.println(" "+node.key);
            traverseTree1(node.right);
        }
    }
    void traverseTree1(Node node){
        if(node!=null){
            System.out.println(" "+node.key);
            traverseTree1(node.left);
            traverseTree1(node.right);
        }
    }
    void traverseTree2(Node node){
        if(node!=null){
            traverseTree2(node.left);
            traverseTree2(node.right);
            System.out.println(" "+node.key);
        }
    }
    public static void main(String[] args){
        TreeProject tree=new TreeProject();
        tree.root=new Node("Bharani");
        tree.root.left=new Node("SivaramiReddy");
        tree.root.right=new Node("Malleswari");
        tree.root.left.left=new Node("Rangareddy");
        tree.root.left.right=new Node("Chennamma");
        tree.root.right.right=new Node("Jayamma");
        tree.root.right.left=new Node("Yellareddy");
        System.out.println("inorder");
        tree.traverseTree(tree.root);
        System.out.println("preorder:");
        tree.traverseTree1(tree.root);
        System.out.println("postorder");
        tree.traverseTree2(tree.root);
    }
}