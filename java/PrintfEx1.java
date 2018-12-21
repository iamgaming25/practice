class PrintfEx1 {
    public static void main (String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000L;
        long hex = 0xFFF_FFF_FFF_FFF_FFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.println(binNum);
        System.out.println("");

        System.out.printf("b = %d%n", b);
        System.out.printf("s = %d%n", s);
        System.out.printf("c = %c, %d%n", c, (int)c);

        System.out.printf("finger = [%5d]%n", finger);
        System.out.printf("finger = [%-5d]%n", finger);
        System.out.printf("finger = [%05d]%n", finger);

        System.out.printf("big = %d%n", big);
        System.out.printf("hex = %#x%n", hex);
        System.out.printf("octNum = %#o, %d%n", octNum, octNum);
        System.out.printf("hexNum = %#x, %d%n", hexNum, hexNum);
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);

        String url = "https://something";

        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);

        System.out.printf("d = %f%n", d);
        System.out.printf("d = %14.10f%n", d);

        System.out.printf("[123450]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.3s]%n", url);
    }
}