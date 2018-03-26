public class Exercise11_2 {
    public static void main(String[] args) {
        BST<Character> BST = new BST<>();
        BST.insert('j');
        BST.insert('p');
        BST.insert('d');
        BST.insert('f');
        BST.insert('s');
        BST.insert('b');
        BST.insert('n');
        BST.insert('k');
        BST.insert('e');
        BST.insert('w');
        BST.insert('c');
        BST.insert('r');
        BST.insert('g');

        BST.inorder();
        System.out.println();
        BST.preorder();
        System.out.println();
        BST.postorder();
    }
}
