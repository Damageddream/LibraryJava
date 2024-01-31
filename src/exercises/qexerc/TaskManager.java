package exercises.qexerc;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager {
    private static final int ADD_NEW_TASK = 0;
    private static final int GET_HIGHEST_PRIORITY_TASK = 1;
    private static final int EXIT = 2;

    private static PriorityQueue<Task> tasks = new PriorityQueue<>();

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            printOptions();
            System.out.println("Wybierz opcję: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case ADD_NEW_TASK:
                    createAndaAddTask();
                    break;
                case GET_HIGHEST_PRIORITY_TASK:
                    System.out.println(getHighestPriorityTask());
                    break;
                case EXIT:
                    System.out.println("Koniec programu");
            }

        } while(option != EXIT);

    }

    private static void printOptions() {
        System.out.println(ADD_NEW_TASK + " - Dodaj nowe zadanie");
        System.out.println(GET_HIGHEST_PRIORITY_TASK + " - Pobierz zadanie o najwyzszym priorytecie");
        System.out.println(EXIT + " - Wyjdź z programu");
    }

    private static void prinPriorities() {
        for (Priority value : Priority.values()) {
            System.out.println(value.getName() + " " + value.getNum());
        }
    }

    private static void createAndaAddTask() {
        System.out.println("Podaj nazwę zadania: ");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania: ");
        String describtion = sc.nextLine();
        System.out.println("Wybierz prioritet: ");
        prinPriorities();
        Priority priority = Priority.fromDescription(sc.nextLine());
        if (describtion == null) {
            Task task = new Task(name, priority);
            tasks.offer(task);
        } else {
            Task task = new Task(name, describtion, priority);
            tasks.offer(task);
        }

    }

    private static Task getHighestPriorityTask() {
        return tasks.poll();
    }

}
