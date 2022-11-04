public class RightTriangle {
    public double cathet1;
    public double cathet2;
    public double hypotenuse;

    public RightTriangle(double c1, double c2) {
        cathet1 = c1;
        cathet2 = c2;
    }

    double get_hyp(){
        hypotenuse = Math.sqrt(cathet2*cathet2+cathet1*cathet1);
        return hypotenuse;
    }

}
