public abstract class Member{

    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateFees();

    @Override 
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }
    
}