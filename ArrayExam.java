public class ArrayExam {
    public static void main(String[] args) {
        // [정수] 1개를 저장할 [변수를 선언]하세요.
        int a;
        a=10;
        // [정수] [3개]를 저장할 [변수를 선언]하세요.
        int[] b=new int[3];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        int[] x={1,2,3,4,5}; // 초기화
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        //Q. 아래  char[ ] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자apple로 출력하세요
        char[] c={'A','P','P','L','E'}; // APPLE
        for (int i = 0; i < c.length; i++) {
            System.out.print((char)(c[i]+32));
        }
    }
}
