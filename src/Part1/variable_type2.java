package Part1;

public class variable_type2 {
    public static void main(String[] args){
        byte b =100;
        short s = 30000;
        int i = 2100000000;
        long l = 7000000000L; // float, long은 접미사를 붙여줘야함
        float f = 9.8F; // float말고 double
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        System.out.println(b+ "최대값" + Byte.MAX_VALUE);
        System.out.println(s+ "최대값" + Short.MAX_VALUE);
        System.out.println(i+ "최대값" + Integer.MAX_VALUE);
        System.out.println(l+ "최대값" + Long.MAX_VALUE);
        System.out.println(f+ "최대값" + Float.MAX_VALUE);
        System.out.println(d+ "최대값" + Double.MAX_VALUE);
        System.out.println(c+ "최대값" + Character.MAX_VALUE);
        System.out.println(bl);
    }
}
