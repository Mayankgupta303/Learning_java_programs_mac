package OOPs.Access_Modifier.police;

public class Cop {

    public int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void canIShoot(){

        System.out.println("YEs you Can!");
    }

}
