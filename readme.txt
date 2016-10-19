1.先启动provider
2.启动consumer
3.在mac下使用Multicast注册中心启动报错解决方式：
  a、如果在同一机器上，需设置unicast=false：即：multicast://224.5.6.7:1234?unicast=false
  b、增加虚拟机参数    -Djava.net.preferIPv4Stack=true
4.