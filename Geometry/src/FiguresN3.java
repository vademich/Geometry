public class FiguresN3 {
    public double r1;
    public double R2;
    public double corner(){
        return (4 * R2 * R2 - Math.PI * R2 * R2) / 8;
    }
    public double ring(){
        return (Math.PI * R2 * R2 - Math.PI * r1 * r1) / 8;
    }
    public double center(){
        return Math.PI * r1 * r1 / 8;
    }
    public double figure1(){
        return 4 * corner() + 3 * center();
    }
    public double figure2(){
        return corner() + ring() + 6 * center();
    }
    public double figure3(){
        return 2 * corner() + 6 * ring() + 2 * center();
    }
}
