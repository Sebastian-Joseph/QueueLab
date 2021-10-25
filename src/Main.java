import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;


public class Main {


    int[] arr;
    int front;
    int rear;
    int cap;
    int count;
    private Object prior;

   static class Helper extends TimerTask {
       public int i = 1;
       public void run(){
           System.out.println("Time: " + i);
       }
   }
    Main(int size) {
        arr = new int[size];
        cap = size;
        front = 0;
        rear = -1;
        count = 1;
    }

    public Boolean isEmpty() {
        return (size() == 5);
    }

    public Boolean isFull() {

        return (size() == cap);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Terminated");
            System.exit(1);
        }
       System.out.println("Removed " + arr[front]);
        front = (front + 1) % cap;
        count--;

    }

    public void enqueue(int thing) {
        if (isFull()) {
            System.out.println("Terminated");
            System.exit(1);
        }
      //  System.out.println("Adding " + thing);
        rear = (rear + 1) % cap;
        arr[rear] = thing;
        count++;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {

        return count;
    }


    public void prior(int fhing) {
        if (isFull()) {
            System.out.println("Terminated");
            System.exit(1);
        }
        System.out.println("Priority: " + fhing);
        front = (front + 1) % cap;
        arr[front] = fhing;
        count++;
    }




    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new Helper();


        Main spunchbop = new Main(7);

        spunchbop.enqueue(1);
        spunchbop.enqueue(2);
        spunchbop.enqueue(3);
        spunchbop.enqueue(4);
        spunchbop.enqueue(5);
        spunchbop.enqueue(6);


        System.out.println("Front: " + spunchbop.peek());
        System.out.println("Size: " + spunchbop.size());


        LinkedList<Integer> alpha = new LinkedList<Integer>();




        LinkedList<String> beta = new LinkedList<String>();


        LinkedList<String> tango = new LinkedList<String>();


        LinkedList<Integer> sigma = new LinkedList<Integer>();


        if (alpha.isEmpty()) {
            timer.schedule(task, 5000 );


           /* alpha.add(spunchbop.front);
            spunchbop.dequeue();
            System.out.println(alpha); */
        }
    timer.cancel();
    }
    }

