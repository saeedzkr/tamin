package org.tamin.services.controller;

import java.io.Serializable;

/**
 * Created by crusader on 6/3/16.
 */
public class ServiceHeader implements ServiceHeaderModel, Serializable {

    private String clazzName;
    private String serviceName;
    private String serviceType;
    private long userID;
    private String ipAddress;


    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public void setUserID(long userID) {
        this.userID = userID;
    }

    @Override
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public long getUserID() {
        return userID;
    }

    @Override
    public String getIpAddress() {
        return ipAddress;
    }


    @Override
    public String getClazzName() {
        return clazzName;
    }

    @Override
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }
}
