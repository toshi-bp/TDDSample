# テストに聞いてみる

- サブクラス内の`times`メソッドの差異をなくした
- デバッグ用途のみに使用する`toString`メソッドの実装
- `Franc`の代わりに`Money`を用いて動作するか否かをテストを通して確認
- 実験を進めるためにテストを追加

## TODO リスト

- [ ] $5+10CHF=$10(レート →2:1)
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
- [x] `times`の一般化
- [x] `Franc`と`Dollar`を比較する
- [x] 通貨の概念
- [ ] `testFrancMultiplication`を削除するか否か
