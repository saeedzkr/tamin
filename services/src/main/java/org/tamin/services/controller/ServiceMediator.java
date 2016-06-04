package org.tamin.services.controller;


import org.tamin.services.service.ServiceManager;

import java.lang.reflect.Method;

/**
 * Created by crusader on 6/3/16.
 */
public class ServiceMediator implements ServiceManager {


    @Override
    public ServiceResponse invokeService(ServiceRequest request) {
        try {
            System.out.println("===================================0020");
            Class cls = Class.forName(request.getServiceHeader().getClazzName());
            Object obj = cls.newInstance();


            Method method = cls.getDeclaredMethod(request.getServiceHeader().getServiceName());
            Object returnVal = method.invoke(obj, request);
            return (ServiceResponse) returnVal;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
