public class Librarian extends Member {

    public Librarian(String name, int memberId) {
        super(name, memberId);
    }

    @Override
    public double calculateFees() {
        return 0;
    }

    @Override
    public String toString() {
        return "Library Member - " + super.toString()
                + ", Fee: " + calculateFees();
    }
}
