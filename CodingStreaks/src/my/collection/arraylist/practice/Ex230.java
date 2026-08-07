package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex230 {

    private ArrayList<Integer> list;
    private ArrayList<Operation> history;

    static class Operation {
        String type;
        int index;
        int value;

        Operation(String type, int index, int value) {
            this.type = type;
            this.index = index;
            this.value = value;
        }
    }

    public Ex230() {
        list = new ArrayList<>();
        history = new ArrayList<>();
    }

    // Add element
    public void add(int value) {
        list.add(value);
        history.add(new Operation("ADD", list.size() - 1, value));
    }

    // Insert element
    public void insert(int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return;
        }
        list.add(index, value);
        history.add(new Operation("INSERT", index, value));
    }

    // Remove element
    public void remove(int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index");
            return;
        }
        int removedValue = list.remove(index);
        history.add(new Operation("REMOVE", index, removedValue));
    }

    // Update element
    public void update(int index, int newValue) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index");
            return;
        }
        int oldValue = list.get(index);
        list.set(index, newValue);
        history.add(new Operation("UPDATE", index, oldValue));
    }

    // Undo last operation
    public void rollback() {
        if (history.isEmpty()) {
            System.out.println("Nothing to rollback.");
            return;
        }

        Operation op = history.remove(history.size() - 1);

        switch (op.type) {
            case "ADD":
                list.remove(list.size() - 1);
                break;

            case "INSERT":
                list.remove(op.index);
                break;

            case "REMOVE":
                list.add(op.index, op.value);
                break;

            case "UPDATE":
                list.set(op.index, op.value);
                break;
        }

        System.out.println("Rollback performed.");
    }

    // Display ArrayList
    public void display() {
        System.out.println("ArrayList: " + list);
    }

    public static void main(String[] args) {

        Ex230 obj = new Ex230();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.display();

        obj.insert(1, 15);
        obj.display();

        obj.update(2, 25);
        obj.display();

        obj.remove(3);
        obj.display();

        System.out.println("\nRollback 1");
        obj.rollback();
        obj.display();

        System.out.println("\nRollback 2");
        obj.rollback();
        obj.display();

        System.out.println("\nRollback 3");
        obj.rollback();
        obj.display();

        System.out.println("\nRollback 4");
        obj.rollback();
        obj.display();

        System.out.println("\nRollback 5");
        obj.rollback();
        obj.display();
    }
}