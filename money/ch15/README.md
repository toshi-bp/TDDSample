# テスト任せとコンパイラ任せ

- 理想的な動きを示すテストを書き, テストを動かせるところまで後退
- 一般化(抽象度の高い型で宣言すること)作業を, 末端から行いテストケースまで到達させる
- 変更の際にコンパイラに従い修正を施す

## TODO リスト

- [x] $5+10CHF=$10(レート →2:1)
- [x] $5+$5=$10
- [ ] $5+$5 が`Money`を返す
- [x] `Bank.reduce(Money)`
- [x] `Money`を変換して換算を行う
- [x] `Reduce(Bank, String)`
- [ ] `Sum.plus`
- [ ] `Expression.times`

## TODO リスト(旧)

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
- [x] `testFrancMultiplication`を削除するか否か
