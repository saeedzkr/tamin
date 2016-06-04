package org.tamin.services.service;

import org.tamin.services.controller.ServiceRequest;
import org.tamin.services.controller.ServiceResponse;
import org.tamin.services.entity.DTOModel;

import javax.ws.rs.QueryParam;

/**
 * Created by crusader on 6/3/16.
 */
public interface ServiceManager {


    ServiceResponse invokeService(ServiceRequest request) throws ClassNotFoundException;





}
