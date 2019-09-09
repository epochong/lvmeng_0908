/**
 * @author epochong
 * @date 2019/9/8 17:47
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Febonacci {
    public static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(f(20));
    }
}
