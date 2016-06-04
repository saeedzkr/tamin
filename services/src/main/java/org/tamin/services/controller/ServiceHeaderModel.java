package org.tamin.services.controller;

/**
 * Created by crusader on 6/3/16.
 */
public interface ServiceHeaderModel {

    public static final String SERVICE_URL = "127.0.0.1";
    public static final String PROCESS_SERVICE = "PROCESS_SERVICE";
    public static final String BUSINESS_SERVICE = "BUSINESS_SERVICE";
    public static final String VALIDATION_SERVICE = "VALIDATION_SERVICE";

    void setServiceName(String serviceName);

    void setServiceType(String serviceType);

    void setUserID(long userID);

    void setIpAddress(String ipAddress);

    String getServiceName();

    String getServiceType();

    long getUserID();

    String getIpAddress();

    void setClazzName(String clazzName);
    String getClazzName();

}
