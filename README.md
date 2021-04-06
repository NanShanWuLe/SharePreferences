# SharePreferences
SharePreferences存储
## 2021-4-5 将数据存储到SharedPreferences中  
调用SharedPreferences对象的edit()方法来获取一个Editor对象，用putString等方法来添加数据，再调用apply()提交数据  
```SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();  
   editor.putString("name", "Tom");  
   editor.putBoolean("married", false);  
   editor.apply();
```  
### 小Tips
TextUtils.isEmpty()可以用来判断两个空值，字符串等于null或者等于空字符串时，这个方法都会返回true


