package com.myth.dubbo.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;


import com.myth.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    private DemoService demoService;

    public void setDemoService(DemoService demoService)
    {
      this.demoService = demoService;
    }

    public void start() throws Exception {
        for (int i = 0; i < 5; i++) {
            try {
                String hello = this.demoService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(1000L);
        }
    }
    
    
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello); //   
  
        // System.out.println(demoService.hehe());  
        System.in.read();
    }  
}
