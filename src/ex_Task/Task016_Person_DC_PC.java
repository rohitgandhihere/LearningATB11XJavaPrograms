package ex_Task;

public class Task016_Person_DC_PC {

    public static void main(String[] args) {

        Person person = new Person();

         person.name="Amit";
         person.doHome();
         person.eat();

        Person p1 = new Person("Prachi",11,"Mumbai hhftre",123322131, false);

        p1.eat();


    }
}
    class Person {

        String name;
        int age;
        String address;
        long phoneNumber;
        Boolean isMale;

        void eat() {
            System.out.println(this.name+" is Eatting");
        }

        void sleep() {
            System.out.println("Sleep");
        }

        void walk() {

            System.out.println("Walk");
        }

        void doHome() {
            System.out.println("doHome");
        }


        //DC
        public Person() {

            System.out.println("Default Constructor");

            name = "Rohit";
            address = "ABCD Swargate Pune 411046";
            age = 35;
            phoneNumber = 987654321;
            isMale = true;

        }

        // PC
        public Person(String name, int age, String address, long phoneNumber, boolean isMale) {

            System.out.println("Parameterized Constuctor");
            this.name = name;
            this.address = address;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.isMale = isMale;

        }
    }