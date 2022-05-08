/**
 * Purpose: Insertion and Deletion
 * @author Iker Perez-Calderon
 * @version 3/1/2022
 */
public class ElectionTesterV5 {
    public static void main(String[] args) {
        // Added null to add space into the array for the insertions
        Candidate[] electionArray = {new Candidate("Tony Stark", 3691), new Candidate("Henry Pym", 2691), new Candidate("Hank Pym", 1962), new Candidate("Peter Parker", 1491), new Candidate("Bruce Banner", 1968), null, null};
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
        insert(electionArray, position, fVotes, name1);
        totalVotes = votes2(electionArray);
        output(electionArray, totalVotes);
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes);
        System.out.println();

        System.out.println("Before Bruce Banner, add" + name2 + ", " + bVotes + " votes" );
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate         Votes     % of Total Votes");
        System.out.println("============================================");
        System.out.println();
        selectInsert(electionArray, name3, name2, bVotes);
        totalVotes = votes2(electionArray);
        output(electionArray, totalVotes);
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes);
        System.out.println();

    }

    public static void output(Candidate electionArray[], int totalVotes) {
        for(int i = 0; i < electionArray.length; i++) {
            // Added null if statement so that it would not cause an error
            if(electionArray[i] != null) {
                System.out.printf("%-13s     %3d       %5.2f \n", electionArray[i].getName(), electionArray[i].getVotes(), (electionArray[i].getVotes() / (double)totalVotes) * 100);
            }
        }
    }

    public static int votes(Candidate electionArray[], int totalVotes) {
        for(Candidate i: electionArray) {
            // Added null if statement so that it would not cause an error
            if(i != null) {
                System.out.println(i);
                totalVotes += i.getVotes();
            }
        }
        return totalVotes;
    }

    public static int votes2(Candidate electionArray[]) {
        int total = 0;
        for(Candidate i: electionArray) {
            // Added null if statement so that it would not cause an error
            if(i != null) {
                total += i.getVotes();
            }
        }
        return total;
    }

    public static void insert(Candidate electionArray[], int position, int addVotes, String addName) {
        for(int i = electionArray.length - 1; i > position; i--) {
            electionArray[i] = electionArray[i-1];
        }
        electionArray[position] = new Candidate(addName, addVotes);
    }

    public static void selectInsert(Candidate electionArray[], String find, String addName, int addVotes) {
        int position = 0;
        for(int i = 0; i < electionArray.length; i++) {
            if(electionArray[i] != null) {
                if(electionArray[i].getName().equals(find)) {
                    position = i;
                }
            }
        }

        for (int k = electionArray.length - 1; k > position; k--) {
            electionArray[k] = electionArray[k-1];
        }
        electionArray[position] = new Candidate(addName, addVotes);
    }
}