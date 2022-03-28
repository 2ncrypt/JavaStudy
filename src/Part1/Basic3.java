package Part1;

public class Basic3 {
    public static void main(String[] args){
        System.out.println("test");
    }
}

//(1)
// static으로 선언된 함수(메서드)나 변수는 자바vm에서 인스턴스 객체의 생성없이 호출을 할 수 있다.
// 객체의 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다.
// 자바 프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다.
// statitc으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
// 그런후에 "main"으로 이름이 만들어진 메서드가 있는를 찾아서 그 메서드를 가장먼저 시작점(entryPoint)의 메서드로써 호출을 하게 되는것.