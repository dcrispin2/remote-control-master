package edu.iu.dcrispin.remotecontroller.repository;

import edu.iu.dcrispin.remotecontroller.model.DeviceData;

import java.util.List;

public interface IRemoteLoader {
    void setup(int id, List<DeviceData> devices);

    String onButtonWasPushed(int id, int slot);
    String offButtonWasPushed(int id, int slot);

}
