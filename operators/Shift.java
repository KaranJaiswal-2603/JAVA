public class Shift {
    public static void main(String[] args) {
        int a=45;
        a=a<<31;
        System.out.println(a);

        int b=21;
        b=b>>1;
        System.out.println(b);

        int c=345;
        c=c>>>1;
        System.out.println(c);

        byte d=78;
        d=(byte)(d>>1);
        System.out.println(d);
    }
}
