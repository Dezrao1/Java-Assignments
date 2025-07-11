public class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(2654, "Daniel", "Dicy2006");

        User curUser = new User(6231, "Ndumbe");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}
