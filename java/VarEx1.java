class VarEx1 {
    public static void main (String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);

        int x = 10;
        int y = 20;

        System.out.println(x);
        System.out.println(y);

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println(x);
        System.out.println(y);

        final int WIDTH = 20;
        final int HEIGHT = 10;

        int triangleArea = (WIDTH*HEIGHT) / 2;
        int rectangleArea = (WIDTH*HEIGHT);

        System.out.println(triangleArea);
        System.out.println(rectangleArea);

        char exC = 'A';
        byte exB = 5;
        short exS = 10_000;
        int exI = 98;
        int exIb = 0b11;
        int exI0 = 077;
        int exIx = 0x1515;
        long exL = 999L;
        float exF = 3.14f;
        double exD = 0.44d;

        System.out.println(exC);
        System.out.println(exB);
        System.out.println(exS);
        System.out.println(exI);
        System.out.println(exIb);
        System.out.println(exI0);
        System.out.println(exIx);
        System.out.println(exL);
        System.out.println(exF);
        System.out.println(exD);

        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(str);
        
        System.out.println(7+7+" ");
        System.out.println(" "+7+7);
    }
}