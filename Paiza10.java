// 複数のデータを受け取る 
// ループ処理で Scanner オブジェクトを使うと、標準入力から複数のデータを受け取ることができる。
import java.util.*;

public class Paiza10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            String name = scan.next();
            System.out.println("Hello " + name);
        }

        
    }
    
}




