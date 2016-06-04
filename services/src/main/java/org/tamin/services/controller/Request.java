package org.tamin.services.controller;

import java.io.Serializable;

/**
 * Created by crusader on 6/3/16.
 */
public class Request implements ServiceRequest , Serializable {

    @Override
    public void setServiceHeader(ServiceHeader header) {

    }

    @Override
    public ServiceHeader getServiceHeader() {
        return null;
    }
}
