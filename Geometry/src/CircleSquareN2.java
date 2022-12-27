public class CircleSquareN2 {
//    r - радиус вписанной окружности
//    r * 2 - сторона квадрата
    public double r;
//    Площадь квадрата = 4 * r * r
//    Площадь круга = pi * r * r
    public double Square(double r){
        return 4 * r * r;
    }
    public double Circle(double r){
        return Math.PI * r * r;
    }
    public double figure1(){
        return (Square(r) - Circle(r)) / 2;
    }
    public double figure2(){
        return figure1() + Circle(r);
    }
    public double figure3(){
        return figure1() / 2 + r * r;
    }
}
