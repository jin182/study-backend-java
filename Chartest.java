public class Chartest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B' + 1;
        System.out.println("b = " + (char)b );
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanU);
        char upper ='A';
        char lower= (char) (upper+32);
        System.out.println("lower = " + lower);
        
        char lower1 = 'u';
        int upeer1 =  lower1 - 32;
        System.out.println("upeer1 = " + (char)upeer1);

        char i = '1';
        char j = '2';
        int sum = (i - '0') + (j - '0');
        System.out.println("sum = " + sum);
    }
}
