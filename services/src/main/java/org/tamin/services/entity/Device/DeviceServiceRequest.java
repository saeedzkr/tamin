package org.tamin.services.entity.Device;

import org.tamin.services.controller.ServiceHeader;
import org.tamin.services.controller.ServiceHeaderModel;
import org.tamin.services.controller.ServiceRequest;
import org.tamin.services.entity.DTOModel;

/**
 * Created by crusader on 6/3/16.
 */
public class DeviceServiceRequest implements ServiceRequest {


    private String clazzName= "org.tmain.model.dao.DeviceDAOImpl";
    private DTOModel dtoModel;
    private ServiceHeader serviceHeader;



    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public DTOModel getDtoModel()
    {
        return dtoModel;
    }

    public void setDtoModel(DTOModel dtoModel) {
        this.dtoModel = dtoModel;
    }


    public ServiceHeader getServiceHeader()
    {
        return serviceHeader;
    }



    @Override
    public void setServiceHeader(ServiceHeader serviceHeader) {
        this.serviceHeader = serviceHeader;
    }


}
