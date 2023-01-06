# springboottestdemo
创建一个springboot工程的测试案例
使用mybatis连接数据库，拿到指定数据
创建本案例的初衷是想要测试使用接口定义常量，并在工程中使用到该常量
记录错误：使用mybatis的过程中，遇到一些问题，在这里记录一下
第一个问题：使用mybatis的配置不熟练，说明自己的基础还很薄弱，mybatis依赖引入，在配置文件中配置数据源（如果没配置将启动失败），指定mybatis的映射文件的地址，在使用中配置的映射文件名称错误，
导致mybatis在读取sql，设置参数的时候报了org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)这个绑定异常错误。
第二个问题：在xml中使用#{}和${}使用混乱，#{}相当于使用了占位符的方式，先对sql预编译，防止了sql注入的问题，而且会将java类型的参数转化为jdbc类型参数，如果使用了${}的方式获取参数的话，
相当于jdbc中的statement的方式，进行的字符串拼接，可能出现sql注入问题，并且不会将java类型数据转化为jdbc类型数据，如果不转化的话，最终mybatis解析过后的sql就会有存在类型不匹配的问题，${}
这种获取参数的方式，适用于传递的参数是表名或者字段名的情况。
