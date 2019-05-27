## 问题描述
小明手里有若干个钱包，每个钱包里有若干现金，并放在不同的口袋里。
钱包格式如下
```json
{
  amount: 100,
  pocket: 'xxxxx'
}
```

现在小明需要给别人支付一定数额的现金`out`，每次支付要将钱包里面的所有钱`allAmount`都拿出来，并交一笔手续费，其值为`fee`，是通过某个公式算出来的，如果`allAmount > out + fee`，还需要给自己找零。而如果`allAmount > out && allAmount < out + fee`，则不需要找零
现在他选择按照这样的策略选择钱包进行支付:
1. 尽量找到一个不需要找零的钱包
2. 如果没有符合1的钱包，则尽量找到一组相同口袋并且不需要找零的钱包
3. 如果没有符合2的一组钱包，则对钱包按照`amount`进行排序，然后选择一组刚好能支付`out`和`fee`的钱包，无论要不要找零。

请你按照这个策略编写一个程序。

## 测试数据
```json
inputs:[
{
  amount: 100,
  pocket: 'a',
},
{
  amount: 25,
  pocket: 'a',
},
{
  amount: 19,
  pocket: 'c',
},
{
  amount: 43,
  pocket: 'b',
},
{
  amount: 7,
  pocket: 'b',
},
{
  amount: 111,
  pocket: 'b',
},
{
  amount: 90,
  pocket: 'c',
}]

fee: 2 * selectedInputs.length + 1.3 * outputs.length + 1.4;

outputs: [
  {
    amount: 152
  },
  {
    amount: 112
  }
]

```