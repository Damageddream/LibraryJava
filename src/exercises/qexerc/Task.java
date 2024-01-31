package exercises.qexerc;

import exercises.array.CompareTexts;

import java.util.Objects;

public class Task implements Comparable<Task> {
    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority.getNum(), o.priority.getNum());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(description, task.description) && priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, priority);
    }

    private String name;
    private String description;
    private Priority priority;

    public Task(String name, String description, Priority priority) {
        this(name, priority);
        this.description = description;
    }

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
