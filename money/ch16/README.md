# 将来の読み手を考えたテスト

- 連鎖的に定義変更を行い, コンパイラに従い修正を行った
- 最後に簡単な実験を行い, うまくいかないと判断して破棄した

## TODO リスト

- [x] $5+10CHF=$10(レート →2:1)
- [x] $5+$5=$10
- [x] $5+$5 が`Money`を返す
- [x] `Bank.reduce(Money)`
- [x] `Money`を変換して換算を行う
- [x] `Reduce(Bank, String)`
- [x] `Sum.plus`
- [x] `Expression.times`

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
