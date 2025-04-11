package Model;
public class Client extends User{
    public Client(){
        super();
    }
    public void showList(){
        System.out.println("1. View Car");
        System.out.println("2. Rent Car");
        System.out.println("3. Return Car");
        System.out.println("4. Show My Rents");
        System.out.println("5. Edit My Data");
        System.out.println("6. Quit\n");
    }
}
