public class Main {
    public static void main(String[] args) {
        System.out.println("1. Найти высоты треугольника");
        TriangleN1 triangle = new TriangleN1();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("a = " + triangle.a + ", b = " + triangle.b + ", c = " + triangle.c);
        System.out.println("hc = " + triangle.heightA());
        System.out.println("hb = " + triangle.heightB());
        System.out.println("hc = " + triangle.heightC());
        System.out.println("----------------------------");

        System.out.println("2. Найти площади фигур");
        CircleSquareN2 fig1 = new CircleSquareN2();
        fig1.r = 10;
        System.out.println("Площадь первой фигуры = " + fig1.figure1());
        System.out.println("Площадь второй фигуры = " + fig1.figure2());
        System.out.println("Площадь третьей фигуры = " + fig1.figure3());
        System.out.println("----------------------------");

        System.out.println("3. Найти площади фигур");
        FiguresN3 emb1 = new FiguresN3();
        emb1.r1 = 8;
        emb1.R2 = 10;
        System.out.println("Площадь первой фигуры = " + emb1.figure1());
        System.out.println("Площадь первой фигуры = " + emb1.figure2());
        System.out.println("Площадь первой фигуры = " + emb1.figure3());
        System.out.println("----------------------------");
    }
}
