package study;

public class Study {

    public static void main(String[] args) {
        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */
        constants.FruitsConstants list=new  constants.FruitsConstants();
        fruits.Fruits print=new fruits.Fruits();
        print.printFruits(list.FRUITS_LEMON_04,list.FRUITS_COUNT_20);        
    }

}
