
/**
 * Write a description of class Program here.
 * f
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Program
{
    public static void main() {
        int x = 12;
        double m = 0.51;
        double z = (Math.exp(Math.PI*x)-(Math.exp(-(Math.PI)*x)))/(Math.sqrt(Math.log(m*x)));
        double k = Math.cos(z)/Math.sin(z);
        System.out.printf("x = %d\tm = %.2f = %e\n",x,m,m);
        System.out.printf("Значение переменной z в формате IEEE 754:\n%s\n",Long.toBinaryString(Double.doubleToLongBits(z)));
        System.out.printf("Значение переменной k в формате IEEE 754:\n%s\n",Long.toBinaryString(Double.doubleToLongBits(k)));
    }
}
