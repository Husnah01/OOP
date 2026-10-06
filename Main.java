public class Main {

    public static void main(String[] args) {

        Member student = new StudentMember("Hussina", 101);
        Member publisher = new Publisher("Lisette", 102);
        Member library = new Librarian("Aline", 103);

        System.out.println();
        System.out.println("===== MEMBERS =====");

        System.out.println(student);
        System.out.println(publisher);
        System.out.println(library);

        System.out.println();
        System.out.println("===== FEES =====");

        System.out.println("Student fee: "
                + student.calculateFees());

        System.out.println("Publisher fee: "
                + publisher.calculateFees());

        System.out.println("Library member fee: "
                + library.calculateFees());
    }
}