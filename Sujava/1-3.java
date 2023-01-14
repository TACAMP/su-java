// 「mainメソッド」＝　「public static void main (string [] args)」←このmainの部分がmainメソッドと呼ばれる所以
// mainメソッドの中には文(statement)を順番にかいていく。
// プログラミングは上から順番に処理されていく
// ⚠︎文末には必ず「;」をつけることを忘れないで!
public class Main{
    public static void main( String [] args){
        System.out.println("Hello World!");
        System.out.println( 5*5 );
        int x;
        x = 3;
        System.out.println( x * x);
    }
}

// 変数宣言の文
// 「変数」= データを格納するためにコンピュータ内部に準備する箱のようなもの。
// 変数の名前として使える文字や数字の並びのことを識別子(identifier)と呼ぶ
// 名前は基本自由ですが、通常はアルファベット、数字、アンダースコア「＿」、ドル記号「＄」などを組み合わせて作る。
// ただし、予約後という約50個あるkeywordは使ってはならない
// すでに使用している変数名を再度利用してはいけない
// 大文字、小文字、全角、半角は区別される。(javaにおいては完全に区別される)
// 小文字で始まるわかりやすい名前をつけることが好ましい
