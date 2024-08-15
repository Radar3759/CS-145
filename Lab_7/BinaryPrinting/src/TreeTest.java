import java.security.SecureRandom;


//mostly from fig 21.16 in the book
public class TreeTest {
    public static void main(String[] args) throws Exception {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("A list of ten random numbers: ");
        for (int i = 1; i<= 10; i++ ){
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }
        System.out.printf("%n%nPreorder transversal%n");
        tree.preorderTraversal();

        System.out.printf("%n%nInorder transversal%n");
        tree.inorderTraversal();

        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();
        //not from fig 21.16 
        tree.insertNode(2);
        tree.outputTree(0);
        

    
    }

}
