package OOPs.Access_Modifier.criminal;

import OOPs.Access_Modifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        // thief.canIShoot();
        System.out.println(thief.gun);
    }



}
