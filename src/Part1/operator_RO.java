package Part1;

public class operator_RO {
    public static void main(String[] args){
        int kor = 70,  eng=40, math=70;
        boolean rst1, rst2,rst3, rst4, rst5,rst6;

        rst1 = kor ==eng;
        rst2 = kor!= eng;
        rst3 = kor> eng;
        rst4 = kor >=math;
        rst5 = kor <eng;
        rst6 = kor <=math;

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        System.out.println(rst4);
        System.out.println(rst5);
        System.out.println(rst6);
    }
}
