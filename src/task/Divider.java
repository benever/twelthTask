package task;

public class Divider implements Operation{
    @Override
    public double getResult(double a, double b) {
        if (b!=0) return a / b;
        else return 0;
    }
}
