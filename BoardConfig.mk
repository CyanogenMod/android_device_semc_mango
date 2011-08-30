-include device/semc/msm7x30-common/BoardConfigCommon.mk

TARGET_BOOTLOADER_BOARD_NAME := mogami
TARGET_SPECIFIC_HEADER_PATH := device/semc/anzu/include

#BOARD_WPA_SUPPLICANT_DRIVER := CUSTOM
#BOARD_WLAN_DEVICE := wl1271
#BOARD_SOFTAP_DEVICE := wl1271
#WPA_SUPPLICANT_VERSION := VER_0_6_X
#WIFI_DRIVER_MODULE_PATH := /system/lib/modules/tiwlan_drv.ko
#WIFI_DRIVER_MODULE_NAME := tiwlan_drv
#WIFI_FIRMWARE_LOADER := wlan_loader
#WIFI_EXT_MODULE_PATH := /system/lib/modules/sdio.ko
#WIFI_EXT_MODULE_NAME := sdio

# Wifi related defines
BOARD_WLAN_DEVICE := wl1271
WPA_SUPPLICANT_VERSION := VER_0_6_X
BOARD_WPA_SUPPLICANT_DRIVER := CUSTOM
BOARD_WPA_SUPPLICANT_PRIVATE_LIB := libCustomWifi
WIFI_DRIVER_MODULE_PATH := "/system/lib/modules/tiwlan_drv.ko"
WIFI_DRIVER_MODULE_NAME := tiwlan_drv
WIFI_DRIVER_MODULE_ARG := ""
WIFI_DRIVER_FW_STA_PATH := "/system/etc/wifi/tiwlan_firmware.bin"
WIFI_FIRMWARE_LOADER := wlan_loader
PRODUCT_WIRELESS_TOOLS := true
BOARD_SOFTAP_DEVICE := wl1271
AP_CONFIG_DRIVER_WILINK := true
WIFI_DRIVER_FW_AP_PATH := "/system/etc/wifi/softap/tiwlan_firmware_ap.bin"
WIFI_EXT_MODULE_PATH := /system/lib/modules/sdio.ko
WIFI_EXT_MODULE_NAME := sdio

TARGET_OTA_ASSERT_DEVICE := SK17i,SK17a,mango

BOARD_CAMERA_USE_GETBUFFERINFO := true

-include device/semc/msm7x30-common/Android.mk
