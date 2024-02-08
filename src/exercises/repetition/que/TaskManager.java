package exercises.repetition.que;

import exercises.qexerc.Priority;
import exercises.qexerc.Task;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager {
    static final String ADD_TASK = "Dodaj nowe zadanie - 1";
    static final String GET_TOP_TASK = "Pobierz najważniejsze zadanei - 2";
    static final String EXIT = "Wyjedź z programu -3";
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PriorityQueue<Tasl> tasks = new PriorityQueue<>(new Comparator<Tasl>() {
            @Override
            public int compare(Tasl o1, Tasl o2) {
                return -Integer.compare(o1.getPriority().ordinal(), o2.getPriority().ordinal());
            }
        });

        boolean working = true;
        while (working){
            getInfo();
            try{
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1:{
                        tasks.offer(createTask());
                        break;
                    }
                    case 2: {
                        System.out.println(tasks.poll());
                        break;
                    }
                    case 3: {
                        System.out.println("zamykanie programu");
                        working=false;
                        break;
                    }
                    default: {
                        System.out.println("Nieporpawnie wybrana opcja");
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("Niepoprawny wybór");
            }

        }
    }
    static void getInfo(){
        System.out.println("Wybierz opcję: ");
        System.out.println(ADD_TASK);
        System.out.println(GET_TOP_TASK);
        System.out.println(EXIT);
    }
    static Tasl createTask(){
        System.out.println("Podaj nazwę: ");
        String name = sc.nextLine();
        System.out.println("Podaj opis: ");
        String desc = sc.nextLine();
        System.out.println("Podaj priorytet: ");
        Tasl.Priority prio = printPriority();
        return new Tasl(name, desc, prio);
    }
    static Tasl.Priority printPriority(){
        for (Tasl.Priority value : Tasl.Priority.values()) {
            System.out.println("Wybierz "+value.name());
        }
        String prioName = sc.nextLine();
        for (Tasl.Priority value : Tasl.Priority.values()) {
            if(prioName.equals(value.name())){
                return value;
            }
        }
        return null;
    }
}
