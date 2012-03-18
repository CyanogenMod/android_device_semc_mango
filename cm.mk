## Specify phone tech before including full_phone
$(call inherit-product, vendor/cm/config/gsm.mk)

# Release name
PRODUCT_RELEASE_NAME := SK17i

TARGET_BOOTANIMATION_NAME := vertical-320x480

# Inherit some common CM stuff.
$(call inherit-product, vendor/cm/config/common_full_phone.mk)

# Inherit device configuration
$(call inherit-product, device/semc/mango/device_mango.mk)

## Device identifier. This must come after all inclusions
PRODUCT_DEVICE := mango
PRODUCT_NAME := cm_mango
PRODUCT_BRAND := SEMC
PRODUCT_MODEL := Xperia Mini Pro

#Set build fingerprint / ID / Product Name ect.
PRODUCT_BUILD_PROP_OVERRIDES += PRODUCT_NAME=SK17i BUILD_ID=ITL41F BUILD_DISPLAY_ID=ITL41F BUILD_FINGERPRINT="google/yakju/maguro:4.0.1/ITL41F/228551:user/release-keys" PRIVATE_BUILD_DESC="yakju-user 4.0.1 ITL41F 228551 release-keys"
