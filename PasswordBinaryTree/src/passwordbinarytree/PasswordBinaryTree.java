
package passwordbinarytree;

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PasswordBinaryTree {
    
    private static final String SPECIAL_CHARS = "@*$!&";
    
    private boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        int digitCount = 0;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                digitCount++;
                if (digitCount >= 2) {
                    hasDigit = true;
                }
            } else if (SPECIAL_CHARS.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }
        
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
    
    public int countValidPasswords(TreeNode root) {
        return countValidPasswordsHelper(root, "");
    }

    private int countValidPasswordsHelper(TreeNode node, String currentPassword) {
        if (node == null) {
            return 0; 
        }
        
        String newPassword = currentPassword + node.val;

        int validPasswordCount = isValidPassword(newPassword) ? 1 : 0;
        
        validPasswordCount += countValidPasswordsHelper(node.left, newPassword);
        validPasswordCount += countValidPasswordsHelper(node.right, newPassword);
        
        return validPasswordCount;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode('R');
        root.left = new TreeNode('b');
        root.right = new TreeNode('2');
        root.left.left = new TreeNode('3');
        root.left.right = new TreeNode('!');
        root.right.left = new TreeNode('D');
        root.right.right = new TreeNode('5');
        
        PasswordBinaryTree solution = new PasswordBinaryTree();
        int count = solution.countValidPasswords(root);
        System.out.println("Valid Passwords Count: " + count);

        // Example 2: Another test case
        TreeNode root2 = new TreeNode('X');
        root2.left = new TreeNode('y');
        root2.right = new TreeNode('1');
        root2.left.left = new TreeNode('2');
        root2.left.right = new TreeNode('@');
        root2.right.left = new TreeNode('D');
        root2.right.right = new TreeNode('3');
        
        int count2 = solution.countValidPasswords(root2);
        System.out.println("Valid Passwords Count:" + count2);
    }
}
