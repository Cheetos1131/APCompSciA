import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> classList = new ArrayList<Student>();
        classList.add(new Student("Tony Stark", 95, 95, 95, 95, 95));
        classList.add(new Student("Bruce Wayne", 96, 96, 96, 96, 96));
        classList.add(new Student("Bruce Banner", 97, 97, 97, 97, 97));
        classList.add(new Student("Hank Pym", 98, 98, 98, 98, 98));
        classList.add(new Student("Henry Pym", 99, 99, 99, 99, 99));

        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        output(classList);
        System.out.println();

        String name1 = "Bruce Banner";
        String name2 = "Peter Parker";
        String name3 = "Wanda Maximov";
        String name4 = "Bruce Wayne";
        String name5 = "Clint Barton";
        String name6 = "Hank Pym";
        String name7 = "Henry Pym";
        int quizNumber = 3;
        int quizChange = 93;
        int quiz1 = 90;
        int quiz2 = 91;
        int quiz3 = 92;
        int quiz4 = 93;
        int quiz5 = 94;
        int quiz6 = 95;
        int quiz7 = 96;
        int quiz8 = 97;
        int quiz9 = 98;
        int quiz10 = 99;

        System.out.println("Changing " + name1 + " to " + name2);
        System.out.println();
        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        replaceName(classList, name1, name2);
        output(classList);
        System.out.println();

        System.out.println("Changing " + name2 + "'s quiz " + quizNumber + " to " + quizChange);
        System.out.println();
        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        replaceQuiz(classList, name2, quizNumber, quizChange);
        output(classList);
        System.out.println();

        System.out.println("Replacing " + name4 + "'s data with " + name3 + "'s data");
        System.out.println();
        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        replaceStudent(classList, name4, name3, quiz1, quiz2, quiz3, quiz4, quiz5);
        output(classList);
        System.out.println();

        System.out.println("Inserting " + name5 + " before " + name6);
        System.out.println();
        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        insert(classList, name6, name5, quiz6, quiz7, quiz8, quiz9, quiz10);
        output(classList);
        System.out.println();

        System.out.println("Deleting " + name7 + " from the class");
        System.out.println();
        System.out.println("                 Class List");
        System.out.println("Name                Q1     Q2     Q3     Q4     Q5");
        System.out.println("==================================================");
        delete(classList, name7);
        output(classList);
        System.out.println();
    }

    public static void output(ArrayList<Student> classList) {
        for(Student i: classList) {
            System.out.println(i);
        }
    }

    public static void replaceName(ArrayList<Student> classList, String find, String replace) {
        int position = 0;
        int k;

        for(k = 0; k < classList.size(); k++) {
            if(classList.get(k).getName().equals(find)) {
                position = k;
                break;
            }
        }
        if(k != classList.size()) {
            classList.get(position).setName(replace);
        }

    }

    public static void replaceQuiz(ArrayList<Student> classList, String findName, int findQuiz, int replaceQuiz) {
        int position = 0;
        int k;
        
        for(k = 0; k < classList.size(); k++) {
            if(classList.get(k).getName().equals(findName)) {
                position = k;
                break;
            }
        }
        if(k != classList.size()) {
            if(findQuiz == 1) {
                classList.get(position).setQ1(replaceQuiz);
            }
            else if(findQuiz == 2) {
                classList.get(position).setQ2(replaceQuiz);
            }
            else if(findQuiz == 3) {
                classList.get(position).setQ3(replaceQuiz);
            }
            else if(findQuiz == 4) {
                classList.get(position).setQ4(replaceQuiz);
            }
            else if(findQuiz == 5) {
                classList.get(position).setQ5(replaceQuiz);
            }
            else {
                System.out.println("Invalid quiz number");
            }
        }

    }

    public static void replaceStudent(ArrayList<Student> classList, String find, String replaceName, int replaceQ1, int replaceQ2, int replaceQ3, int replaceQ4, int replaceQ5) {
        int position = 0;
        int k;

        for(k = 0; k < classList.size(); k++) {
            if(classList.get(k).getName().equals(find)) {
                position = k;
                break;
            }
        }
        if(k != classList.size()) {
            classList.get(position).setName(replaceName);
            classList.get(position).setQ1(replaceQ1);
            classList.get(position).setQ2(replaceQ2);
            classList.get(position).setQ3(replaceQ3);
            classList.get(position).setQ4(replaceQ4);
            classList.get(position).setQ5(replaceQ5);
        }
    }

    public static void insert(ArrayList<Student> classList, String find, String name, int q1, int q2, int q3, int q4, int q5) {
        int position = 0;
        for(int k = 0; k < classList.size(); k++) {
            if(classList.get(k).getName().equals(find)) {
                position = k;
            }
        }
        classList.add(position, new Student(name, q1, q2, q3, q4, q5));
    }

    public static void delete(ArrayList<Student> classList, String find) {
        int position = 0;
        int k;

        for(k = 0; k < classList.size(); k++) {
            if(classList.get(k).getName().equals(find)) {
                position = k;
                break;
            }
        }
        if(k != classList.size()) {
            classList.remove(position);
        }
    }
}