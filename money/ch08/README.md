# 実装をなくす

- 重複を除去できる状態に近づけるため, `times`メソッドを合わせた
- メソッド宣言は親クラスで行う
- `Factory Method`パターンを導入して, テストコードから 2 つのサブクラスの存在を隠した
- テストは冗長になるが, 今はそのままにしておいた

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
- [ ] `times`の一般化
- [x] `Franc`と`Dollar`を比較する
- [ ] 通貨の概念
- [ ] `testFrancMultiplication`を削除するか否か
