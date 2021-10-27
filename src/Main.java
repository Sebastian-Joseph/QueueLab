import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Queue;

public class Main {

    static class Helper extends TimerTask {
        public  int i = 0;
        public void run() {
            System.out.println( + ++i);
        }
    }
    public static void main(String[] args) {
    Queue<Integer> alpha = new LinkedList<>();
    Queue<Integer> beta = new LinkedList<>();
    Queue<Integer> tango = new LinkedList<>();
    Queue<Integer> sigma = new LinkedList<>();
    Timer timer = new Timer();
    TimerTask task = new Helper();
  //  timer.schedule(task, 2000, 5000);


        int min = 1;
        int max = 11;
        int min2 = 14;
        int max2 = 100;
        int gnumber = min + (int) (Math.random() * (max - min));
        int customer = min2 + (int) (Math.random() * (max2 - min2));

        for (int i = 0; i < 5; i++)
            alpha.add(i);

        for (int i = 5; i < 12; i++)
            beta.add(i);

        for (int i = 12; i < 13; i++)
            tango.add(i);


        System.out.println("Sebs Movie Theater!!!");
        System.out.println("");
        System.out.println("Before.");
        System.out.println("Customers in line for Alpha: " + alpha.size());
        System.out.println("Customer in line for Beta: " + beta.size());
        System.out.println("Customer in line for Tango: " + tango.size());
        System.out.println("Customer in line for Sigma: " + sigma.size());
        System.out.println("");




    while (gnumber == 2 || gnumber == 5 || gnumber == 10 || gnumber == 8) {
        if (alpha.size() < beta.size() && alpha.size() < tango.size() && alpha.size() < sigma.size()) {
            alpha.add(customer);
            System.out.println("Customer has been added to Alpha!");
            System.out.println("Size of Line Alpha: " + alpha.size() + ". Customers in Line Alpha: " + alpha);
        }
        else if (beta.size() < alpha.size() && beta.size() < tango.size() && beta.size() < sigma.size()) {
            beta.add(customer);
            System.out.println("Customer has been added to Beta!");
            System.out.println("Size of Line Beta: " + beta.size() + ". Customers in Line Beta: " + beta);
        }
        else if (tango.size() < alpha.size() && tango.size() < beta.size() && tango.size() < sigma.size()) {
            tango.add(customer);
            System.out.println("Customer has been added to Tango!");
            System.out.println("Size of Line Tango: " + tango.size() + ". Customers in Line Tango: " + tango);
        }
        else if (sigma.size() < alpha.size() && sigma.size() < beta.size() && sigma.size() < tango.size()) {
            sigma.add(customer);
            System.out.println("Customer has been added to Sigma!");
            System.out.println("Size of Line Sigma: " + sigma.size() + ". Customers in Line Sigma: " + sigma);
        }

    }
    }
}


