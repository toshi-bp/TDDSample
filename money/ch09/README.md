# 歩幅の調整

- 大きめの設計変更の前に手前の小さな変更を行う
- 差異を呼び出し側(Factory Method 側)に移動することによって, 2 つのサブクラスのコンストラクタを近づけていった
- 完全に同じ内容になった 2 つのコンストラクタを親クラスに引き上げた

## TODO リスト

- [ ] $5+10=CHF(レート →2:1)
- [x] $5\*2=$10
- [x] `amount`を**private**にする
- [x] `Dollar`の副作用どうするか
- [ ] `Money`の丸め処理どうするか
- [x] `equals()`
- [ ] `hashCode()`
- [ ] null との等価性比較
- [ ] 他のオブジェクトとの等価性比較
- [x] 5CHF \* 2 = 10 CHF
- [ ] `Dollar`と`Franc`の重複をなくす
- [x] `equals`の一般化
- [ ] `times`の一般化
- [x] `Franc`と`Dollar`を比較する
- [x] 通貨の概念
- [ ] `testFrancMultiplication`を削除するか否か