package Part1;

public class print {
    public static void main(String[] args){
        //Part.print , println : ln = \n 한줄 띄기
        System.out.print("안녕하세요");
        System.out.println(" 테스트");
        int a = 12;
        float b= (float) 12.45678;
        //지시자를 사용
        //형식 : %d(정수) , %f(소숫점 형식), %c(문자), %s(문자열), %b(부울) , %n(줄바꿈) %e(지수), %o(8진수), %x(16진수)
        //소숫점으로 들어올때는 잘 체크해서 넣어야 에러가 안남
        System.out.printf("테스트 %d 입니다. \n",a);

        System.out.printf("소숫점 1자리 %.1f, 소숫점 2자리%.2f \n", b,b);

        System.out.printf("테스트 10진수는 %d이고 16진수는 %x, 8진수는 %o이다.",a,a,a);
    }
}
