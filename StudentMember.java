public class StudentMember extends Member {
    public StudentMember(String name, int memberId) {
        super(name, memberId);
    }

    @Override 
    public double calculateFees() {
        return 20000;
    }

    @Override 
    public String toString() {
        return "Publisher Member - " +
               super.toString() +
               ", Fee: " + calculateFees();
    }
    
}