package com.kevin.bluetooth.bluetooth;

/**
 * 经典蓝牙
 */

public class BluetoothStandard extends BaseBluetooth {

    private ScanTimeoutHandler timeoutHandler;

    public BluetoothStandard() {
        timeoutHandler = new ScanTimeoutHandler(this);
    }

    @Override
    public void startScan() {

    }

    @Override
    public void stopScan() {

    }

    @Override
    public void scanTimeout() {

    }
}