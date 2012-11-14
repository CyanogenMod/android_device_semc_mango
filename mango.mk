# proprietary side of the device
$(call inherit-product-if-exists, vendor/semc/mango/mango-vendor.mk)

DEVICE_PACKAGE_OVERLAYS += device/semc/mango/overlay

$(call inherit-product, device/semc/mogami-common/mogami.mk)

$(call inherit-product, device/common/gps/gps_eu_supl.mk)

# These are the hardware-specific features
PRODUCT_COPY_FILES += \
    frameworks/native/data/etc/android.hardware.telephony.gsm.xml:system/etc/permissions/android.hardware.telephony.gsm.xml \
    frameworks/native/data/etc/android.hardware.camera.front.xml:system/etc/permissions/android.hardware.camera.front.xml

PRODUCT_AAPT_CONFIG := normal mdpi mdpi
PRODUCT_AAPT_PREF_CONFIG := mdpi

# Init files
PRODUCT_COPY_FILES += \
    device/semc/mango/prebuilt/init.semc.usb.rc:root/init.semc.usb.rc \
    device/semc/mango/prebuilt/pre_hw_config.sh:root/pre_hw_config.sh \
    device/semc/mango/prebuilt/hw_config.sh:system/etc/hw_config.sh \
    device/semc/msm7x30-common/prebuilt/logo_M.rle:root/logo.rle

# Device specific part for two-stage boot
PRODUCT_COPY_FILES += \
    device/semc/mango/recovery/bootrec-device:recovery/bootrec-device

# Device specific configs
PRODUCT_COPY_FILES += \
    device/semc/mango/config/cyttsp-spi.idc:system/usr/idc/cyttsp-spi.idc \
    device/semc/mango/config/qwerty.idc:system/usr/idc/qwerty.idc \
    device/semc/mango/config/qwerty2.idc:system/usr/idc/qwerty2.idc \
    device/semc/mango/config/pm8058-keypad.idc:system/usr/idc/pm8058-keypad.idc \
    device/semc/mango/config/pm8058-keypad.kcm:system/usr/keychars/pm8058-keypad.kcm \
    device/semc/mango/config/atdaemon.kl:system/usr/keylayout/atdaemon.kl \
    device/semc/mango/config/msm_pmic_pwr_key.kl:system/usr/keylayout/msm_pmic_pwr_key.kl \
    device/semc/mango/config/pm8058-keypad.kl:system/usr/keylayout/pm8058-keypad.kl \
    device/semc/mango/config/simple_remote.kl:system/usr/keylayout/simple_remote.kl \
    device/semc/mango/config/cyttsp_key.kl:system/usr/keylayout/cyttsp_key.kl \
    device/semc/mango/config/init.qcom.bt.sh:system/etc/init.qcom.bt.sh \
    device/semc/mango/config/sensors.conf:system/etc/sensors.conf \
    device/semc/mango/config/tiwlan.ini:system/etc/tiwlan.ini

$(call inherit-product, device/semc/msm7x30-common/prebuilt/resources-mdpi.mk)

#LCD DENSITY
PRODUCT_PROPERTY_OVERRIDES += \
    ro.sf.lcd_density=160 \
    com.qc.hdmi_out=false
