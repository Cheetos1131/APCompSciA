/**
 * Purpose: Challenge Program
 * @author Iker Perez-Calderon
 * @version 3/4/2022
 */
public class Contacts {
    // create private vars
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String email;

    // create constructor
    public Contacts(String name, String relation, String birthday, String phoneNumber, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // create toString method
    public String toString() {
        String str = String.format("%-20s %-11s      %-6s      %-12s     %-30s", getName(), getRelation(), getBirthday(), getPhoneNumber(), getEmail());
        return str;
    }
}