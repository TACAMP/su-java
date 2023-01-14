// 「変数の初期化」 = 変数を宣言すると同時に値を代入すること
// 以下例↓
// 通常は
// int age;
// age = 22;
// となるが、これを１行にまとめることができる。
// int age = 22;
// これを変数の初期化という
// 書き方↓
// 型　変数名 = 代入するデータ;

// 変数には異なる値を何度でも代入できる。
// 例↓

public class Age{
    public static void main ( String[] args ){
        int age = 22;
        System.out.println("私の年齢は" + age + "歳です");
        age = 300;
        System.out.println("...嘘です。実は" + age + "歳です。");
    }
}

// 2回目に上書きする場合は、データ型は入れずに変数に新たな値を代入する。
// 変数の上書きはすでに値が入っている変数に代入すると、古い値は消滅し、新しい値に内容が書き換える。

// ...しかし、プログラムを開発していると、"絶対に上書きされたくない,上書きされたら困る"場合もあります。
// そこで定数を利用します。
// 定数にするには変数の宣言の前に「final」をという記述をすれば定数となり書き換えを防止できる。
// 書き方↓
// final 型　定数名 = 初期値;

// 以下が使用例↓
// public class Shopping{
//     public static void main( String [] args ){
//         final double tax = 1.1; ←定数にしたい部分
//         int fax = 100;
//         System.out.println("税込" + fax * tax + "円");
//         tax = 100;
//         System.out.println("２点目商品" + fax * tax + "円");
//     }
// }