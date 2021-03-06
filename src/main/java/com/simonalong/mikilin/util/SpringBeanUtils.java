package com.simonalong.mikilin.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 后续为了防止混淆，这里改名，并迁移到{@link com.simonalong.mikilin.spring.MkSpringBeanContext}
 * @author zhouzhenyong
 * @since 2019/8/3 下午12:14
 */
@Deprecated
@Service
public class SpringBeanUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtils.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name){
        if (null != applicationContext) {
            return applicationContext.getBean(name);
        }
        return null;
    }

    public static <T> T getBean(Class<T> clazz) {
        if (null != applicationContext) {
            return applicationContext.getBean(clazz);
        }
        return null;
    }
}
