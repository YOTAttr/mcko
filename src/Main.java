/******
 //для питона №2
print("x y z w")
        for x in range(0, 2):
            for y in range(0, 2):
                for z in range(0, 2):
                    for w in range(0, 2):
                        if not((not x and not y) or (y == z) or not w):
                            print(x, y, z, w)
 *****/
/*****
 //№6
public class Main {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            String binary = Integer.toBinaryString(n);
            if (n % 2 == 0) {
                binary += "01";
            } else {
                binary += "10";
            }
            int decimal = Integer.parseInt(binary, 2);

            if (decimal > 102) {
                System.out.println(decimal);
                break;
            }
            n++;
        }
    }
}
 *****/

/*****
 //№8
public class Main{
    public static void main(String[] args){
        int s = 0;
        int n = 75;
        while((s + n) < 150){
            s += 15;
            n -= 5;
        }
        System.out.println(n);
    }
}
 ****/
/*****
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int s = 200*256;
        int n = 65*1024*8;
        int i = n/s;
        System.out.println(Math.pow(2,i));
    }
}
 ****/


