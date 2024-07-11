public class VDAtest {
    public static void main(String[] args) {
        int v; // 뱐수선언
        v = 10;
        System.out.println("v = " + v);

        int a = 10;
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        int sum = 0;
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        System.out.println("sum = " + sum);
        int x = 10, y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ":" + " y = "  + y);

    }
}
