package org.tamin.services.service;



import org.tamin.services.controller.ServiceMediator;
import org.tamin.services.controller.ServiceRequest;
import org.tamin.services.controller.ServiceResponse;
import org.tamin.services.entity.Credit;
import org.tamin.services.entity.Device.DeviceDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by crusader on 6/3/16.
 */
@Path("/manager")
public class ServiceManagerImpl {


    private ServiceMediator serviceMediator;

    public void setServiceMediator(ServiceMediator ServiceMediator) {
        serviceMediator = ServiceMediator;
    }

    public ServiceMediator getServiceMediator() {
        return serviceMediator;
    }


//    @POST
//    @Path("/invokeService")
//    @Produces(MediaType.APPLICATION_JSON)
//    public ServiceResponse invokeService(@QueryParam("Request")ServiceRequest request)
//    {
//        System.out.println("===================================0010");
//        return serviceMediator.invokeService(request);
//    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public DeviceDTO test()
    {
//        DeviceDTO dto = new DeviceDTO();
//        dto.setDeviceIP("2222222222222");
//        dto.setDeviceKey("sssssssssss");
//        dto.setPhoneNumber("sadadada");
//        dto.setSubSystemId(1020);
//        return Response.status(200).entity(dto).build();
        DeviceDTO dto = new DeviceDTO(1200 , "s","aa","dd","s" );
                dto.setCredit(new Credit("havij" , "tmp ", 100));
        return dto;
    }


}
