package org.example.recurssion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        toi("A","B", "C", 4);
    }

    public static void toi(String a, String b, String c, int disks) {
        if(disks == 0)
            return;

        toi(a, c , b, disks-1);
        System.out.println(disks+ " "+a+"->"+b);
        toi(c, b, a, disks-1);

    }
}
