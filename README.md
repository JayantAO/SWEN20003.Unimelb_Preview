## 环境

- IntelliJ IDEA 2026.1.3
- Java SDK: OpenJDK 26.0.1

## Java 数据类型：
- primitive type基本数据类型

包括  numeric byte(1个Byte), int(4个Byte), long(8), short(2), float(4, eg 1.2F), double(8, eg 3.4)
和non-numeric char(2个Byte), boolean(1) 
- nonprimitive type引用数据类型（也叫reference type）

### Constant 常量：
- 全大写（正常变量名是驼峰）, eg final int MAX_LENGTH = 400

### Arithmetic & Relational Operators & Logic Operators 数学运算符与操作运算符与逻辑运算符：
- 与C基本一致
- python 的逻辑运算用的是 AND OR NOT, 而 C 和 JAVA 则是&& || ！

### Increment Operators累加、Decrement Operators累减、Conditional Operators条件运算符
- x = (a > b)?:等效于if a>b 则 这一类三元运算符

## 循环
- 两种 for 写法，包括  for(初始化;循环条件;迭代){}、  for(变量或者叫循环元素：循环容器如数组){}
例如for(int item:num){}  （这里的item是数组容器num内部存储的每一个元素）；for(char c:s.toCharArray())  对于字符串，在使用这个方式做循环之前要用这个方法把字符串转化成字符数组

但是for的增强写法本质是一种语法糖，不用太过在意


## 数组

## 进度：
学习到getters and setters
复习了构造函数等的写法，学习到数据类型等