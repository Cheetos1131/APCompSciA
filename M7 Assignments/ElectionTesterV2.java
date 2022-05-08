import java.util.ArrayList;

public class ElectionTesterV2 {
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
            System.out.printf("%-12s      %-7d    %5.2f \n", k.getName(), k.getVotes(), (k.getVotes() / (double)total) * 100);
        }
    }
}
