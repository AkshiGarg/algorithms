package com.rupi.datastructures.list;

public class ListHelper {

    static Node initializeList(final int sizeOfList) {
        Node node = new Node(0);
        final Node head = node;
        for (int i = 1; i < sizeOfList; i++) {
            final Node nextNode = new Node(i);
            node.setNextNode(nextNode);
            node = nextNode;
        }
        return head;
    }

    static void printList(final Node head) {
        Node node = head;
        while (node.getNextNode() != null) {
            System.out.print(node.getValue() + " -> ");
            node = node.getNextNode();
        }
        System.out.println(node.getValue());
    }
}
