package study;
// ① TaskクラスにCalculatorクラスを継承させなさい。

/**
 * タスクの実行
 */
public class Task extends Calculator {
   int a=10;
   int b=20;
   int c=30;
   
    public void doTask() {
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
       System.out.println("plusメソッドの引数が一つの場合："+ super.plus(a));
       System.out.println("plusメソッドの引数が一つの場合："+ super.plus(a,b));
       System.out.println("plusメソッドの引数が一つの場合："+ super.plus(a,b,c));    
    }
}
