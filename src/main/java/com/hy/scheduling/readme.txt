1、在配置类中启调度配置  @EnableScheduling
2、在需要调度的方法上使用@Scheduled(fixedRate = 2000)类似这样的配置
3、在程序启动后，则会完成调度