/*package login;
import java.util.Scanner;
//package llogin;
//import login.login;
//import java.util.Scanner;
//import java.util.Scanner;
public class main {
    private static login[] loginArray = new login[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------");
            System.out.println("1.회원가입 2.로그인 3.사용자 조회 4.탈퇴");
            System.out.println("----------------------------------------");
            System.out.print("선택 -> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createLogin();

            } else if (selectNo == 2) {
                login();

            } else if (selectNo == 3) {
                searchMember();

            } else if (selectNo == 4) {
                withdraw();

            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("종료");
    }

    private static void withdraw() {

    }

    private static void searchMember() {
        System.out.println("-----------");
        System.out.println("사용자 조회");
        System.out.println("-----------");

        for (int i=0; i< loginArray.length; i++){
            login login = loginArray[i];
            if (login != null){
                System.out.print(login.getNickname());
            }
        }

    }

    private static void login() {
        System.out.println("-----------");
        System.out.println("로그인");
        System.out.println("-----------");
        System.out.println("아이디를 입력하시오: ");
        String id = scanner.next();
        System.out.println("비번을 입력하시오: ");
        String password = scanner.next();
        String dbNickname;
        login login = findLogin(id);

        if(login == null){
            System.out.print("아이디가 없습니다");
            return;
        }
        else {
            System.out.println("아이디: " + id);
            for(int i=0; i<loginArray.length; i++) {
                dbNickname = loginArray[i].getNickname();
                System.out.println("닉네임: " + dbNickname);
                break;
            }

        login login2 = findLogin2(password);
        if(login2 == null){
            System.out.print("비밀번호가 없습니다");
            return;
        }
    }

    private static login findLogin(String id) {
        login login = null;
        for(int i=0;i< loginArray.length;i++){
            if(loginArray[i] != null){
                String dbId = loginArray[i].getId();
                if(dbId.equals(id)){
                    login = loginArray[i];
                    break;
                }
            }
        }
        return login;
    }

    private static login findLogin2(String password) {
        login login = null;    //클래스   변수
         for(int i=0;i< loginArray.length;i++){
            if(loginArray[i] != null){
                String dbPassword = loginArray[i].getPassword();
                if(dbPassword.equals(password)){
                    login = loginArray[i];
                    break;
                }
            }
        }
        return login;
    }

    private static void createLogin() {
        System.out.println("-----------");
        System.out.println("회원가입");
        System.out.println("-----------");

        System.out.print("아이디: ");
        String id = scanner.next();

        System.out.print("비번: ");
        String password = scanner.next();

        System.out.print("닉네임: ");
        String nickname = scanner.next();

        login newLogin = new login(id, password, nickname);

        for (int i=0; i< loginArray.length; i++){
            if(loginArray[i] == null){
                loginArray[i] = newLogin;
                System.out.println("회원가입이 되었습니다.");
                break;
            }
        }
    }
}*/
package login;
import java.util.Scanner;


public class main {

    private static login[] loginArray = new login[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------");
            System.out.println("1.회원가입 2.로그인 3.사용자 조회 4.탈퇴");
            System.out.println("----------------------------");
            System.out.print("선택 -> ");

            int selectNo = scanner.nextInt();

            if(selectNo==1) {
                createLogin();
            }else if(selectNo==2){
                login();
            }else if(selectNo==3) {
                searchMember();
            }else if(selectNo==4) {
                withdraw();
            }else if(selectNo==5) {
                run = false;
            }
            System.out.println("종료");

        }

    }

    private static void withdraw() {

    }
    private static void searchMember() {
        System.out.println("-------");
        System.out.println("사용자 조회");
        System.out.println("-------");

        for(int i=0; i<loginArray.length; i++) {
            login login = loginArray[i];
            if(login != null) {
                System.out.print(login.getNickname());
            }
        }
    }

    private static void login() {
        System.out.println("---------");
        System.out.println("로그인");
        System.out.println("아이디를 입력하시오: ");
        String id = scanner.next();
        System.out.println("비번을 입력하시오: ");
        String password = scanner.next();
        String dbNickname;
        login login = findLogin(id);



        if(login == null) {
            System.out.println("아이디가 없습니다.");
            return;
        }
        else {
            System.out.println("아이디: " + id);
            for(int i=0; i<loginArray.length; i++) {
                dbNickname = loginArray[i].getNickname();
                System.out.println("닉네임: " + dbNickname);
                break;
            }

        }

        login login2 = findLogin2(password);
        if(login2 == null) {
            System.out.println("비밀번호가 없습니다.");
            return;
        }
    }

    private static login findLogin(String id) {
        login login = null;
        for(int i=0; i<loginArray.length; i++) {
            if(loginArray[i] != null) {
                String dbId = loginArray[i].getId();
            //    String dbNickname = loginArray[i].getNickname();
                if(dbId.equals(id)) {
                    login = loginArray[i];
                    break;
                }
            }
        }
        return login;
    }

    private static login findLogin2(String password) {
        login login = null;
        for(int i=0; i<loginArray.length; i++) {
            if(loginArray[i] != null) {
                String dbPassword = loginArray[i].getPassword();
                if(dbPassword.equals(password)) {
                    login = loginArray[i];
                    break;
                }
            }
        }
        return login;
    }

    private static void createLogin() {
        System.out.println("----");
        System.out.println("회원가입");
        System.out.println("----");

        System.out.print("아이디: ");
        String id = scanner.next();

        System.out.print("비번: ");
        String password = scanner.next();

        System.out.print("닉네임: ");
        String nickname = scanner.next();

        login newLogin = new login(id, password, nickname);

        for(int i=0; i<loginArray.length; i++) {
            if(loginArray[i] == null) {
                loginArray[i] = newLogin;
                System.out.println("회원가입이 되었습니다.");
                break;
            }
        }
    }
}