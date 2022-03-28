package Part1;

public class variable {
    public static void main(String[] args){
        int a; //정수가 저장될 변수 이름
        int b = 10;
        a = 3;
        int sum;
        sum = a+b;

        System.out.println(sum);
    }
}
// 자바에서의 변수는 변수 타입에 맞는 선언을 해줘야함
// 정수형의 변수를 사용고자 한다면 -> 정수 타입의 자료형을 선언 후 사용

// 기본형 타입Type
// 정수형 => byte(1byte), short(2), int(4), long(8)
// 실수형 => float(4), double(8)
// 문자형 => char(2)
// 부울형(논리) => boolean(1byte) -> True/False

// 참조형 타입
// 클래스(Class) , 배열(array), 인터페이스(interface), 문자열(String, immutable)
// 데이터가 저장된 메모리의 주소 값을 저장하는 변수