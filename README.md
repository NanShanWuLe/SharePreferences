# SharePreferences
SharePreferences存储
## 2021-4-5 将数据存储到SharedPreferences中  
调用SharedPreferences对象的edit()方法来获取一个Editor对象，用putString等方法来添加数据，再调用apply()提交数据  
```
SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();  
editor.putString("name", "Tom");  
editor.putBoolean("married", false);  
editor.apply();
```  
### 小Tips
TextUtils.isEmpty()可以用来判断两个空值，字符串等于null或者等于空字符串时，这个方法都会返回true  
## 2021-4-6 从SharedPerferences读取数据  
```
SharedPreferences pref = getSharedPreferences("data", MODE_PRIVATE);
String name = pref.getString("name", "");
int age = pref.getInt("age", 0);
boolean married = pref.getBoolean("married", false);
```
## 2021-4-7 用SharedPreferences完成简易登录界面  
学习使用CheckBox,运用存储与读取完成登录操作，再通过intent来完成页面跳转
