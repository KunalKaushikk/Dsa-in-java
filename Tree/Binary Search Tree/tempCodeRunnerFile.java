{
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildTree(root, values[i]);
        }
        Inorder(root);
        System.out.println();
    }
}