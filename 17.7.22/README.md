# 17.7.22
作业1:
list集合代表有序，可重复的集合，判断两个对象相等通过equals()方法比较返回true即可
map代表有映射关系的集合，key和value存在一对一关系。map中key不允许重复
ArrayList其实是包装了一个数组 Object[]，当实例化一个ArrayList时，一个数组也被实例化，当向ArrayList中添加对象是，数组的大小也相应的改变。
数组的长度不可变，数组在内存中是连续存储的，所以它的索引速度是非常的快
list长度可变，list是collection的子接口，可以实现很多功能
作业2：
List<T> list = new ArayList<T>()；   <T>是泛型的默认值，可以被任意类型所代替
泛型允许在定义接口.类.方法时声明类型形参
