package com.polidea.multiplatformbleadapter.utils.mapper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.polidea.multiplatformbleadapter.Device;
import com.polidea.rxandroidble.RxBleConnection;
import com.polidea.rxandroidble.RxBleDevice;

public class RxBleDeviceToDeviceMapper {

    public Device map(@NonNull RxBleDevice rxDevice, @Nullable RxBleConnection connection) {
        Device device = new Device(rxDevice.getMacAddress(), rxDevice.getName());
        if (connection != null) {
            device.setMtu(connection.getMtu());
        }
        return device;
    }
}
