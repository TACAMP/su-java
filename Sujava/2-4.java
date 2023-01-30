// 強制的な型変換
// 前回の1-3.javaで説明したが、大きな型の値を小さな型の値の変数を代入することは原則できない。
// ですが、それをみんな強制的に無理やり行うことができる。


// public class Age{
//     public static void main( String [] args ){
//         int age = ( int ) 3.2;
//         System.out.println( age );
//     }
// }

// 実行結果は3となります。
// 3.2というdouble型リテラルの前に記述された「(int)」= 強制的な型変換を指示する「キャスト演算子」
// キャスト演算子の記述方↓
// (変換先の型名)　式
// 無理矢理変換するということは、それに伴って代償を払う必要がある。
// キャスト演算子は、元のデータを一部失ってもデータを無理矢理に変換しようとする。
// そのために入りきらない情報は捨てられてしまい、情報の欠陥が発生する。
// 上記で触れたようにキャストは代償を支払う必要があります。
// キャストを用いても変換できない型の組み合わせも存在しますし、データの欠損が不具合に繋がることがある。
// 最終手段として、どうしても必要な場合もあるが、よっぽどのことがない限り使わないと覚えておくようにしましょう。

// public class Main {
//     public static void main( String[]args ){
//         int age = 3;
//         System.out.println( age );
//         boolean bool = true;
//         System.out.println(bool);
//     }
// }

public class Main{
    public static void main( String [] args ){
        int[] ages = {21,23,46,48};

        int allAge = 0;

        for (int age:ages){
            allAge += age;
        }

        System.out.println(allAge);
    }
}



