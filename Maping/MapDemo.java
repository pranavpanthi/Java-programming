package Maping;

import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        MapDemo md1 = new MapDemo();
        MapDemo md2 = new MapDemo();
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
        System.out.println(md1.equals(md2));
        TreeMap tm = new TreeMap<>();

    }
}
