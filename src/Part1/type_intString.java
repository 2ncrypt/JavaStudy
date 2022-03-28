package Part1;

public class type_intString {
    public static void main(String[] args){
        //정수 선언
        int a= 12345;
        String str = "12345";
        System.out.println(str.length());

        //정수 => 문자열 => 자릿수 구하기
        String test = String.valueOf(a);
        System.out.println(test.length());

        //문자열 + 정수형
        System.out.println(12345+1);
        System.out.println(str + 1);

        //문자열 => 정수로 변환
        int b = Integer.parseInt(str);
        System.out.println(b+1);
    }
}
