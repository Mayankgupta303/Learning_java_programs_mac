package OOPs.Encapsulation;

public class Encapsulation_02 {
    public static void main(String[] args) {
        KotakBank mayank = new KotakBank("mayank" , 10000);

        System.out.println(mayank.getName());
        System.out.println(mayank.getBal());

        mayank.setBal(15000 , true);
        System.out.println(mayank.getBal());
    }
}

class KotakBank{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean iscashier) {
        if (iscashier) {
            this.bal = bal;
        } else {
            System.out.println("Not Allowed to change the balance");
        }
    }

    private String name;
    private long bal;

    public KotakBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }
}
