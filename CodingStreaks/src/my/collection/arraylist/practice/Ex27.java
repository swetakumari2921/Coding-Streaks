package my.collection.arraylist.practice;

import java.util.*;

class Student {
    String name;
    ArrayList<String> majors;
    double gpa;

    Student(String name, ArrayList<String> majors, double gpa) {
        this.name = name;
        this.majors = majors;
        this.gpa = gpa;
    }

    void dropMajor(String major) {
        if (majors.contains(major)) {
            majors.remove(major);
            System.out.println(name + " has dropped " + major + ".");
        } else {
            System.out.println(name + " is not enrolled in " + major + ".");
        }
    }

    boolean hasNoMajors() {
        return majors.isEmpty();
    }
}

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== University Enrollment System =====");
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        // Adding students
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter student info in this format:");
            System.out.println("Name NumOfMajors Major1 Major2 ... GPA");
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];
            int numMajors = Integer.parseInt(parts[1]);
            ArrayList<String> majors = new ArrayList<>();

            // Collect all parts between index 2 and last-1 as majors
            for (int j = 2; j < parts.length - 1; j++) {
                majors.add(parts[j]);
            }

            double gpa = Double.parseDouble(parts[parts.length - 1]);
            students.add(new Student(name, majors, gpa));

            System.out.println("Added student: " + name + " with majors " + majors + " and GPA " + gpa);
        }

        // Dropping majors
        System.out.print("\nEnter number of major drop actions: ");
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < m; i++) {
            System.out.println("Enter dropout info (Name MajorToDrop):");
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            String majorToDrop = parts[1];

            boolean found = false;
            for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
                Student s = it.next();
                if (s.name.equals(name)) {
                    found = true;
                    s.dropMajor(majorToDrop);
                    if (s.hasNoMajors()) {
                        it.remove();
                        System.out.println(name + " has no majors left and is removed from the system.");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Student " + name + " not found.");
            }
        }

        // Sort by number of majors descending, then GPA descending
        students.sort((s1, s2) -> {
            if (s2.majors.size() != s1.majors.size()) {
                return s2.majors.size() - s1.majors.size();
            } else {
                return Double.compare(s2.gpa, s1.gpa);
            }
        });

        // Print final list
        System.out.println("\n===== Final List of Students =====");
        for (Student s : students) {
            System.out.println(s.name + ": " + s.majors.size() + " majors, GPA: " + s.gpa);
        }

        sc.close();
    }
}
