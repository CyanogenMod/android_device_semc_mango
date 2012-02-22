-include device/semc/mogami-common/BoardConfigCommon.mk
-include vendor/semc/mango/BoardConfigVendor.mk

BUILD SEMC SENSORS := false
SENSORS_COMPASS_AK897X := true
SENSORS_ACCEL_BMA150_INPUT := false
SENSORS_ACCEL_BMA250_INPUT := true
SENSORS_PROXIMITY_APDS970X := true
SENSORS_PRESSURE_BMP180 := false

TARGET_OTA_ASSERT_DEVICE := SK17i,SK17a,mango

