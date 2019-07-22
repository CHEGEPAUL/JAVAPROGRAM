public class Overloading {
    public static void main(String[] args) {
        hirepurchase(3000,4,500);
        compoundinterest(12000.0,12.5,4.0);
        areaofrectangle(45,31);
        volumeofacuboid(6,6,7);

    }
    public static void hirepurchase(float deposit,float time_in_months,float instalments){
        float amount=(deposit+instalments*time_in_months);
        System.out.println("The total amount including the hire_purchase is is "+amount);
    }
    public static void compoundinterest(double p,double r,double t){
        double interest=(p*t*0.01*r);
        System.out.println("The  compound interest is :"+interest);
    }
    public static void areaofrectangle(int l,int w){
        int area=(l*w);
        System.out.println("The area of the rectangle is  :"+area);
    }
    public static void volumeofacuboid(int p,int q,int z){
        int result=(p*q*z);
        System.out.println("The volume  is :" +result);
    }
}
