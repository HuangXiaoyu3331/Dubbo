package com.huang.provider.serviceimpl;

import com.huang.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author hxy
 * @description DemoServiceImpl
 * @date 2019/3/19
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
