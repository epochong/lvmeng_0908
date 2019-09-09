import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/8 17:28
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(str.replaceAll("[^0-9]",""));
    }
}
