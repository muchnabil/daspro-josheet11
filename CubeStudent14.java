import java.util.Scanner;
public class CubeStudent14 {
    public static int area(int s){
        int a = 6 * s * s;
        System.out.println("The area of the cube is : " + a);
        return a;
    }
    public static int volume (int s){
        int v = s * s * s;
        System.out.println("The volume of the cube is : " + v);
        return v;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of cube : ");
        int s = input.nextInt();
        area(s);
        volume(s);
    }
}
