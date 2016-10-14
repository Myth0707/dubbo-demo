package com.myth.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.container.Container;

public class SpringContextContainer implements Container {
	private static Logger logger = LoggerFactory.getLogger(SpringContextContainer.class);

	static ClassPathXmlApplicationContext context;

	public static ClassPathXmlApplicationContext getContext() {
		return context;
	}

	public void start() {
		logger.info("SpringContextContainer begin starting.....");
		context = new ClassPathXmlApplicationContext("classpath*:dubbo*.xml");
		context.start();
		logger.info("SpringContextContainer is starting.....");
	}

	public void stop() {
		try {
			if (context != null) {
				context.stop();
				context.close();
				context = null;
			}
		}
		catch (Throwable e) {
			logger.error(e.getMessage(), e);
		}
	}

}