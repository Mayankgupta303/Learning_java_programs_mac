package OOPs.Encapsulation;

public class Encapsulation_01 {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);

        PrivateVwoLogin vwoLogin1 = new PrivateVwoLogin("Admin", "Pass123");
//        System.out.println(vwoLogin1.password);

        vwoLogin1.setUsername("Mayank");
        System.out.println(vwoLogin1.getUsername());

        vwoLogin1.setPassword("123Pass");
        System.out.println(vwoLogin1.getPassword());

    }
}

class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }

}

class PrivateVwoLogin{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public PrivateVwoLogin(String user , String pwd){
        this.username = user;
        this.password = pwd;
    }

}
