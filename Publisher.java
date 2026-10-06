public class Publisher extends Member {

    public Publisher(String name, int memberId) {
        super(name, memberId);
    }

    @Override
    public double calculateFees() {
        return 5000;
    }

    @Override
    public String toString() {
        return "Publisher Member - " + super.toString()
                + ", Fee: " + calculateFees();
    }
}