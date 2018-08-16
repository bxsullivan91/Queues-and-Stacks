import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public static void main(String[] args)
    {
        SimpleQueue test = new SimpleQueue();
        test.run();
    }
    private void run()
    {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        String removedValue = myQueue.remove();
        System.out.println("Removed value -> " + removedValue);
        System.out.print("Queue after remove method -> ");
        System.out.println(myQueue);

        removedValue = myQueue.peek();
        System.out.println("Removed value -> " + removedValue);
        removedValue = myQueue.poll();
        System.out.println("Removed value -> " + removedValue);
        removedValue = myQueue.poll();
        System.out.println("Removed value -> " + removedValue);
        removedValue = myQueue.poll();
        System.out.println("Removed value -> " + removedValue);
        removedValue = myQueue.poll();
        System.out.println("Removed value -> " + removedValue);


    }
}
