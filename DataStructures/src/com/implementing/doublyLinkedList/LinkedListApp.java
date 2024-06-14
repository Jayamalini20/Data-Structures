package com.implementing.doublyLinkedList;

import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (true) {
            System.out.println("1. Add First \n2. Add Last \n3. Add At Specific Index \n4. Get Size \n5. Display \n6. Get First \n7. Get Last \n8. Get From Specific Index \n9. Remove First \n10. Remove Last \n11. Remove At Specific Index \n12. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Element:");
                    ll.addFirst(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the Element:");
                    ll.addLast(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the Index and Element:");
                    int index = scan.nextInt();
                    int data = scan.nextInt();
                    ll.addAt(index, data);
                    break;
                case 4:
                    System.out.println("Size of the list: " + ll.getSize());
                    break;
                case 5:
                    ll.display();
                    break;
                case 6:
                    System.out.println("First element: " + ll.getFirst());
                    break;
                case 7:
                    System.out.println("Last element: " + ll.getLast());
                    break;
                case 8:
                    System.out.println("Enter the Index:");
                    System.out.println("Element at index: " + ll.getAt(scan.nextInt()));
                    break;
                case 9:
                    System.out.println("Removed first element: " + ll.removeFirst());
                    break;
                case 10:
                    System.out.println("Removed last element: " + ll.removeLast());
                    break;
                case 11:
                    System.out.println("Enter the Index:");
                    System.out.println("Removed element at index: " + ll.removeAt(scan.nextInt()));
                    break;
                case 12:
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
