public class linkedListQueueTester {
    public static void main(String[] args) {
        linkedListQueue names = new linkedListQueue();

        System.out.println("---------- 1 ----------\n");
        names.enqueue("Tom");
        names.enqueue("Jane");
        names.enqueue("Beth");
        System.out.println(names.displayQueue());

        System.out.println("---------- 2 ----------\n");
        names.enqueue("John");
        names.enqueue("Mary");
        System.out.println(names.displayQueue());

        System.out.println("---------- 3 ----------\n");
        System.out.printf("Queue is empty %s\n", names.isEmpty());
        System.out.printf("Number of items in queue is %s\n", names.size());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println(names.displayQueue());

        System.out.println("---------- 4 ----------\n");
        System.out.println("Remove " + names.dequeue());
        System.out.println(names.displayQueue());

        System.out.println("---------- 5 ----------\n");
        System.out.printf("Queue is empty %s\n", names.isEmpty());
        System.out.printf("Number of items in queue is %s\n", names.size());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println();

        System.out.println("---------- 6 ----------\n");
        System.out.println("Remove " + names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println();

        System.out.println("---------- 7 ----------\n");
        System.out.println("Remove " + names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println();

        System.out.println("---------- 8 ----------\n");
        System.out.println("Remove " + names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println();

        System.out.println("---------- 9 ----------\n");
        System.out.println("Remove " + names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.println();

        System.out.println("---------- 10 ----------\n");
        System.out.println("Queue is empty: " + names.isEmpty());
        System.out.println();

    }
}
