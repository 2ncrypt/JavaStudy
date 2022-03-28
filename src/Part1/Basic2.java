package Part1;

public class Basic2 {
    //메인메서드는 무조건 main으로 해줘야함 String[] 다음은 파라미터 이름이기때문에 전혀 상관없음.
    //public static(이것도 빠지면안됨) void main_method(String[] test){
    public static void main(String[] args){
        System.out.println("Hello Part.Basic2");
    }
}
//(1)
//메인 메서드 => 메인 메서드는 무조건 main()으로 해줘야하고, 없을시에는 에러가 남
//자바 프로그램이 실행되면 제일 먼저 메인 메서드를 찾아 시작함.(Entry Point -> main())

//(2)
//파라미터스 => 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음.
//그러한 인수(파라미터, 매개변수)들의 값을 저장할 변수들을 명시
// String -> 문자열 -> [] 배열)
//args는 하나의 변수 명일 뿐 다른 이름으로 써도 상관이 없음.

//(3)
//반환할 타입 => return type => 반환할 값이 없으면 void => 이 메서드(함수)는 호출하면 겨로가로써 특별히 반환되는 값은 없이 수행되는 메서