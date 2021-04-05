# SharePreferences
SharePreferences存储
## 2021-4-5 将数据春初到SharedPreferences中  
调用SharedPreferences对象的edit()方法来获取一个Editor对象，用putString等方法来添加数据，再调用apply()提交数据  
`SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit()`  


