 import java.util.Scanner;
/**
 * Lab04 Assignment1a.
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class BoxDemo
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter values for Box1");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();
         System.out.println("enter values for Box2");
         int d = input.nextInt();
         int e = input.nextInt();
         int f = input.nextInt();
        Box box1 = new Box(a, b, c);
        Box box2 = new Box(d, e, f);
        
        
        double volume, area;
        volume = box1.volume();
        area = box1.surfaceArea();
        System.out.println("the volume of box1 is " + volume + "cubic cm");
        System.out.println("the surface area of box2 is " + area + "square cm\n");
    }
}
