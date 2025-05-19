public class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(4321, "Daniel", "qwerty@123");

        User curUser = new User(8765, "Ndumbe");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}
