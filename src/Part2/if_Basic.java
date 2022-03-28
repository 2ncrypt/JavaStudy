package Part2;

public class if_Basic {
    public static void main(String[] args) {
        int kor = 70, eng = 90, math = 80;
        int sum = kor+eng+math;

        if (sum >= 250) {
            System.out.println("A");
        }
        //java에서 2개 비교할땐 비교연산자 사용해야함. 여기선 안써도되는데 그냥 써봄
        else if(250 > sum && sum >= 200) {
            System.out.println("B");
        }
        else {
            System.out.println("F");
        }
    }
}
