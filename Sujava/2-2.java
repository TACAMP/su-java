// Javaが式に従って計算処理をすることを、式の評価(evaluation)という。
// 「評価結果への置換の原則」=演算子は周囲のオペランドの情報を使って計算を行い、それらオペランドを巻き込んで結果に化ける。
// 「優先順位の原則」=Javaで定められた優先順位の高い演算子から順に評価されていく。
// 「結合規則の原則」=式の中に同じ優先順位グループに属する演算子が複数ある場合、演算子ごとに決められた「方向」から順に評価される。
// 算術演算子の「+,-,*,/,%」 = 評価の方向は"左→右"
// 文字列結合演算子の「+」 = 評価の方向は"左→右"
// 代入演算子の「=,+=,-=,*=,/=,%=,+=」 = 評価の方向は"右→左"

// インクリメント・デクリメント演算子
// 「++,--」= 評価の方向は"左→右"

// インクリメント・デクリメントの使用例↓
public class Main{
    public static void main( String [] args ){
        int a;
        a = 100;
        a++;
        System.out.println(a);
    }
}

// ++,--は、他の演算子と一緒に使わない！



