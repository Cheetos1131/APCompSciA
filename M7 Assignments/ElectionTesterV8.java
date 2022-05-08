/**
 * Purpose: Insertion and Deletion
 * @author Iker Perez-Calderon
 * @version 3/1/2022
 */
import java.util.ArrayList;

public class ElectionTesterV8 {
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

        int location = 3;
        String name = "Hank Pym";

        System.out.println("Delete position " + location);
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        locationDelete(electionList2, location);
        total = votes2(electionList2);
        Output(electionList2, total);
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        System.out.println();

        System.out.println("Delete " + name);
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        nameDelete(electionList2, name);
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

    public static void locationDelete(ArrayList<Candidate> electionList2, int position) {
        electionList2.remove(position);
    }

    public static void nameDelete(ArrayList<Candidate> electionList2, String find) {
        int position = 0;
        int k;

        for(k = 0; k < electionList2.size(); k++) {
            if(electionList2.get(k).getName().equals(find)) {
                position = k;
                break;
            }
        }
        if(k != electionList2.size()) {
            electionList2.remove(position);
        }
    }
}