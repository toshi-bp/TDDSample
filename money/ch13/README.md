# 実装を導くテスト

- 後で必要になりそうなオブジェクト(`Sum`)の作成を促すテストの作成
- キャストを使って 1 ヶ所で実装した後で, テストが通るままで本来あるべき場所にコードを移した(多分`reduce`)
- ポリモフィズムを用いて明示的なクラスチェックを置き換えた

## TODO リスト

- [ ] $5+10CHF=$10(レート →2:1)
- [ ] $5+$5=$10
- [ ] $5+$5 が`Money`を返す
- [x] `Bank.reduce(Money)`
- [ ] `Money`を変換して換算を行う
- [ ] `Reduce(Bank, String)`

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
