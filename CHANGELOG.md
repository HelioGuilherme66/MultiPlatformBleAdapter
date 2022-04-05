# 0.1.11-rxjava1

* Downgrade RxAndroidBle to 1.7.0-rxjava1

# 0.1.10

* Convert to AndroidX and gradle 7. Compile to AndroidSDK 31

# 0.1.7

* Fix lack of disconnection event on iOS when connection fails to be established
* Fix errors all errors being passed through onError callbacks on Android (thanks, @eliaslecomte)

# 0.1.6

* Fix BluetoothGattCharacteristicUuid collision
* Fix error messages in Android's IllegalState exceptions