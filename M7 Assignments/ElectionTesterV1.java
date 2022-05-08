public class ElectionTesterV1 {
    public static void main(String[] args) {
        Candidate[] electionArray = {new Candidate("Tony Stark", 3691), new Candidate("Henry Pym", 2691), new Candidate("Hank Pym", 1962), new Candidate("Peter Parker", 1491), new Candidate("Bruce Banner", 1968)};
        System.out.println("Raw Data: ");
        System.out.println();
        int totalVotes = 0;

        totalVotes = votes(electionArray, totalVotes);

        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        output(electionArray, totalVotes);
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes);
    }

    public static void output(Candidate electionArray[], int totalVotes) {
        for(int i = 0; i < electionArray.length; i++) {
            System.out.printf("%-12s      %-7d    %5.2f \n", electionArray[i].getName(), electionArray[i].getVotes(), (electionArray[i].getVotes() / (double)totalVotes) * 100);
        }
    }

    public static int votes(Candidate electionArray[], int totalVotes) {
        for(Candidate i: electionArray) {
            System.out.println(i);
            totalVotes += i.getVotes();
        }
        return totalVotes;
    }
}