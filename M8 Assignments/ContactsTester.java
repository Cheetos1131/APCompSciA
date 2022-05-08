/**
 * Purpose: Challenge Program
 * @author Iker Perez-Calderon
 * @version 3/4/2022
 */
public class ContactsTester {
    public static void main(String[] args) {
        Contacts[] contactList = new Contacts[10];
        contactList[0] = new Contacts("Diana Prince", "Aunt", "Oct 25", "321-555-0811", "wonderwoman@theamazon.net");
        contactList[1] = new Contacts("Bruce Wayne", "Uncle", "Jun 15", "651-516-8521", "brucewayne@thebatman.net");
        contactList[2] = new Contacts("Bruce Banner", "Cousin", "Mar 2", "166-647-3558", "brucebanner@thehulk.com");
        contactList[3] = new Contacts("Peter Parker", "Cousin", "Mar 23", "789-138-8535", "peterparker@thespiderman.org");
        contactList[4] = new Contacts("Robin Hood", "Cousin", "Dec 19", "159-468-7538", "robinhood@helpthepoor.org");
        contactList[5] = new Contacts("Tony Stark", "Father", "Jan 5", "123-456-7890", "tonystark@starkindustries.net");
        contactList[6] = new Contacts("Hank Pym", "Grandfather", "Jul 15", "894-358-3829", "hankpym@pymindustries.net");
        contactList[7] = new Contacts("Henry Pym", "Cousin", "Nov 9", "189-357-8292", "henrypym@pymindustries.net");
        contactList[8] = new Contacts("Wade Wilson", "Brother", "Apr 28", "981-354-0893", "wadewilson@deadpool.com");
        contactList[9] = new Contacts("Bucky Barnes", "Cousin", "Aug 25", "891-357-9410", "buckybarnes@barnesandnoble.com");
        
        System.out.println("                             Original Contacts List:");
        System.out.println("Name                 Relationship     Birthday    Phone            Email");
        System.out.println("=================================================================================================");
        output(contactList);
        System.out.println();

        String name = "Tony Stark";
        String name2 = "Joe Mama";
        String relation = "Cousin";
        String relation2 = "Sister";
        String birthday = "Mar";
        String birthday2 = "Feb";
        String phoneNumber = "891-357-9410";
        String phoneNumber2 = "123-321-5555";
        String email = "tonystark@starkindustries.net";
        String email2 = "joemama@fakeemail.com";


        System.out.println("Searching for " + name);
        binarySearchName(nameSort(contactList), name);
        System.out.println();

        System.out.println("Searching for " + name2);
        binarySearchName(nameSort(contactList), name2);
        System.out.println();

        System.out.println("Searching for " + relation);
        binarySearchRelationship(relationshipSort(contactList), relation);
        System.out.println();

        System.out.println("Searching for " + relation2);
        binarySearchRelationship(relationshipSort(contactList), relation2);
        System.out.println();

        System.out.println("Searching for " + birthday);
        sequentialSearchBirthday(contactList, birthday);
        System.out.println();

        System.out.println("Searching for " + birthday2);
        sequentialSearchBirthday(contactList, birthday2);
        System.out.println();

        System.out.println("Searching for " + phoneNumber);
        sequentialSearchPhoneNumber(contactList, phoneNumber);
        System.out.println();

        System.out.println("Searching for " + phoneNumber2);
        sequentialSearchPhoneNumber(contactList, phoneNumber2);
        System.out.println();

        System.out.println("Searching for " + email);
        sequentialSearchEmail(contactList, email);
        System.out.println();

        System.out.println("Searching for " + email2);
        sequentialSearchEmail(contactList, email2);
        System.out.println();
    }

    public static void output(Contacts[] source) {
        for(Contacts i: source) {
            System.out.println(i);
        }
    }

    //Display each time something is done to the array

    public static void sequentialSearchBirthday(Contacts[] source, String find) {
        int found = 0;
        System.out.println("Finding results of: " + find);
        for(int i = 0; i < source.length; i++) {
            if(source[i].getBirthday().substring(0, 3).compareTo(find) == 0) {
                System.out.println(source[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("Have not found: " + find);
        }
        else {
            System.out.println("Found " + found + " items");
        }
    }

    public static void sequentialSearchPhoneNumber(Contacts[] source, String find) {
        int found = 0;
        System.out.println("Finding results of: " + find);
        for(int i = 0; i < source.length; i++) {
            if(source[i].getPhoneNumber().compareTo(find) == 0) {
                System.out.println(source[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("Have not found: " + find);
        }
        else {
            System.out.println("Found " + found + " items");
        }
    }

    public static void sequentialSearchEmail(Contacts[] source, String find) {
        int found = 0;
        System.out.println("Finding results of: " + find);
        for(int i = 0; i < source.length; i++) {
            if(source[i].getEmail().compareTo(find) == 0) {
                System.out.println(source[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("Have not found: " + find);
        }
        else {
            System.out.println("Found " + found + " items");
        }
    }

    public static Contacts[] nameSort(Contacts[] source) {
        Contacts[] dest = new Contacts[source.length];
        for(int i = 0; i < source.length; i++) {
            Contacts next = source[i];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0) {
                if(next.getName().compareTo(dest[k - 1].getName()) > 0) {
                    insertIndex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }

    public static Contacts[] relationshipSort(Contacts[] source) {
        Contacts[] dest = new Contacts[source.length];
        for(int i = 0; i < source.length; i++) {
            Contacts next = source[i];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0) {
                if(next.getRelation().compareTo(dest[k - 1].getRelation()) > 0) {
                    insertIndex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }

    public static void linearPrintLocatorName(Contacts[] source, int low, String find) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getName().compareTo(find) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < source.length) && (source[i].getName().compareTo(find) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(source[i]);
        }
    }

    public static void linearPrintLocatorRelationship(Contacts[] source, int low, String find) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getRelation().compareTo(find) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < source.length) && (source[i].getRelation().compareTo(find) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(source[i]);
        }
    }

    public static void binarySearchName(Contacts[] source, String find) {
        int high = source.length;
        int low = -1;
        int probe;
        while(high - low > 1) {
            probe = (high + low) / 2;
            if(source[probe].getName().compareTo(find) > 0) {
                high = probe;
            }
            else {
                low = probe;
                if(source[probe].getName().compareTo(find) == 0) {
                    break;
                }
            }
        }
        if((low >= 0) && (source[low].getName().compareTo(find) == 0)) {
            linearPrintLocatorName(source, low, find);
        }
        else {
            System.out.println("Not found: " + find);
        }
    }

    public static void binarySearchRelationship(Contacts[] source, String find) {
        int high = source.length;
        int low = -1;
        int probe;
        while(high - low > 1) {
            probe = (high + low) / 2;
            if(source[probe].getRelation().compareTo(find) > 0) {
                high = probe;
            }
            else {
                low = probe;
                if(source[probe].getRelation().compareTo(find) == 0) {
                    break;
                }
            }
        }
        if((low >= 0) && (source[low].getRelation().compareTo(find) == 0)) {
            linearPrintLocatorRelationship(source, low, find);
        }
        else {
            System.out.println("Not found: " + find);
        }
    }
}