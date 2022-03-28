package Part1;

public class operater_AO3 {
    public static void main(String[] args){
        //연산의 결과 => 정수끼리 나눠도 소숫점 형태가 나올 수 있음.
        int a=60, b=8;
        int rst1; double rst2,rst3,rst4;

        rst1 = a/b;
        System.out.println(rst1);
        System.out.println((double) rst1);

        rst2 = (double)a/b;
        System.out.println(rst2);

        rst3 = 100/3;
        System.out.println(rst3);

        rst4 = 100/(double)3;
        System.out.println(rst4);

    }
}
