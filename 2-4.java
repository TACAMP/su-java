// 強制的な型変換
// 前回の1-3.javaで説明したが、大きな型の値を小さな型の値の変数を代入することは原則できない。
// ですが、それをみんな強制的に無理やり行うことができる。


public class Main{
    public static void main( String [] args ){
        int age = ( int ) 3.2;
        System.out.println( age );
    }
}