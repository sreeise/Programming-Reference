package interview_questions.threads.dining_philosophers;

// From Cracking the Coding Interview by Gayle Laakmann McDowell
// https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2015.%20Threads%20and%20Locks/Q15_03_Dining_Philosophers/QuestionB

/*
In the famous dining philosophers problem, a bunch of philosophers are sitting around a circular
table with one chopstick between each of them. A philosopher needs both chopsticks to eat, and
always picks up the left chopstick before the right one. A deadlock could potentially occur
if all the philosophers reached for the left chopstick at the same time. Using threads and locks,
implement a simulation of the dining philosophers problem that prevents deadlocks.
*/

public class PhilosopherExample {
  public static int size = 3;

  public static int leftOf(int i) {
    return i;
  }

  public static int rightOf(int i) {
    return (i + 1) % size;
  }

  public static void runExample() {
    Chopstick[] chopsticks = new Chopstick[size + 1];
    for (int i = 0; i < size + 1; i++) {
      chopsticks[i] = new Chopstick(i);
    }

    Philosopher[] philosophers = new Philosopher[size];
    for (int i = 0; i < size; i++) {
      Chopstick left = chopsticks[leftOf(i)];
      Chopstick right = chopsticks[rightOf(i)];
      philosophers[i] = new Philosopher(i, left, right);
    }

    for (int i = 0; i < size; i++) {
      philosophers[i].start();
    }
  }
}
