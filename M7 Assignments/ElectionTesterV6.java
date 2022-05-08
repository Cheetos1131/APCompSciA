/**
 * Purpose: Insertion and Deletion
 * @author Iker Perez-Calderon
 * @version 3/1/2022
 */
import java.util.ArrayList;

public class ElectionTesterV6 {
    public static void main(String[] args) {
        ArrayList<Candidate> electionList2 = new ArrayList<Candidate>();
        electionList2.add(new Candidate("Tony Stark", 3691));
        electionList2.add(new Candidate("Henry Pym", 2691));
        electionList2.add(new Candidate("Hank Pym", 1962));
        electionList2.add(new Candidate("Peter Parker", 1491));
        electionList2.add(new Candidate("Bruce Banner", 1968));

        System.out.println("Raw Data: ");
        System.out.println();

        int total = Votes(electionList2);

        System.out.println();
        System.out.println();

        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        Output(electionList2, total);
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        System.out.println();

        int position = 2;
        int fVotes = 518;
        int bVotes = 426;
        String name3 = "Bruce Banner";
        String name2 = "Clint Barton";
        String name1 = "Nick Fury";
        System.out.println("Inserting into position " + position + ", " +  name1 + ", " + fVotes + " votes");
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        insert(electionList2, position, name1, fVotes);
        total = votes2(electionList2);
        Output(electionList2, total);
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        System.out.println();

        System.out.println("Before Bruce Banner, add" + name2 + ", " + bVotes + " votes" );
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        System.out.println();
        selectInsert(electionList2, name3, name2, bVotes);
        total = votes2(electionList2);
        Output(electionList2, total);
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        System.out.println();
    }

    public static int Votes(ArrayList<Candidate> electionList2) {
        int totalVotes = 0;
        for(Candidate k: electionList2) {
            System.out.println(k);
            totalVotes += k.getVotes();
        }
        return totalVotes;
    }

    public static void Output(ArrayList<Candidate> electionList2, int total) {
        for(Candidate k: electionList2) {
            System.out.printf("%-13s      %3d       %5.2f \n", k.getName(), k.getVotes(), (k.getVotes() / (double)total) * 100);
        }
    }

    public static int votes2(ArrayList<Candidate> electionList2) {
        int total = 0;
        for (Candidate k: electionList2) {
            total += k.getVotes();
        }
        return total;
    }

    public static void insert(ArrayList<Candidate> electionList2, int position, String addName, int addVotes) {
        electionList2.add(position, new Candidate(addName, addVotes));
    }

    public static void selectInsert(ArrayList<Candidate> electionList2, String find, String addName, int addVotes) {
        int location = 0;
        for(int i = 0; i < electionList2.size(); i++) {
            if(electionList2.get(i).getName().equals(find)) {
                location = i;
            }
        }

        electionList2.add(location, new Candidate(addName, addVotes));
    }
}