package Part1;

public class variable_type {
    public static void main(String[] args) {
        int a;
        int b; int c = 90;
        double d = 3.14;
        char e;

        a = 10;
        b= 10;
        e = 'A'; //쌍따옴표 하면 에러
        System.out.println(e);
        //X int a,b,c = 100; C만 초기화됨
        //O int a,b,c;
        //  a,b,c  = 100; 전부다 초기화
    }
}
