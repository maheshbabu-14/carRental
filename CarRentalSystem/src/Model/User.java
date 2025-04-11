package Model;
public class Car {
    private int ID;
    private String firstName;
    private String lastNmae;
    private String email;
    private String phoneNumber;
    private String password;
    public User(){}
    public int gerID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setModel(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String color){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public double getPassword(){
        return password;
    }
    public void setPassword(double password){
        this.password =  password;
    }
  public abstract void showList();
}

