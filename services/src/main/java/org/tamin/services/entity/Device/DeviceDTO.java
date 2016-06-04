package org.tamin.services.entity.Device;



import org.tamin.services.entity.Credit;

import java.io.Serializable;

/**
 * Created by crusader on 6/3/16.
 */
public class DeviceDTO implements Serializable {

//implements DTOModel, Serializable {


    public DeviceDTO() {
    }

    public DeviceDTO(long subSystemId, String deviceName, String deviceIP, String deviceKey, String phoneNumber) {
        this.subSystemId = subSystemId;
        this.deviceName = deviceName;
        this.deviceIP = deviceIP;
        this.deviceKey = deviceKey;
        this.phoneNumber = phoneNumber;
    }

    private long subSystemId;
    private String deviceName;
    private String deviceIP;
    private String deviceKey;
    private String phoneNumber;
    private Credit credit;


    public void setSubSystemId(long subSystemId) {

        this.subSystemId = subSystemId;
    }


    public long getSubSystemId() {
        return subSystemId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIP() {
        return deviceIP;
    }

    public void setDeviceIP(String deviceIP) {
        this.deviceIP = deviceIP;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "DeviceDTO{" +
                "subSystemId=" + subSystemId +
                ", deviceName='" + deviceName + '\'' +
                ", deviceIP='" + deviceIP + '\'' +
                ", deviceKey='" + deviceKey + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", credit=" + credit +
                '}';
    }
}
