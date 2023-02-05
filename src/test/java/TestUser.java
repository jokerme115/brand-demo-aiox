import java.util.Scanner;

public class TestUser {
    @org.junit.Test
    public void TestLogin(){
        String userName;
        String passWord;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入用户名:");
        userName = scanner.nextLine();
        System.out.println();
        System.out.print("请输入密码:");
        passWord = scanner.nextLine();


    }
}
