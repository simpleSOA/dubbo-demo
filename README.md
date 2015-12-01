可以运行的dubbo-demo
==========
这里使用的zk注册中心,必要的配置zk这里就不写了，自行配置  

1. 修改provider里面conf目录的dubbo.properties
2. 修改consumer里面的spring-application.xml里面的注册中心地址
3. 在项目根目录运行mvn clean package可以得到一个tar.gz的压缩包,解压运行bin目录下面的start.sh即可，这里provider就部署成功了
4. consumer的用法和普通的工程一样
