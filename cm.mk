# Inherit device configuration
$(call inherit-product, device/semc/mango/full_mango.mk)

# Specify phone tech before including full_phone
$(call inherit-product, vendor/cm/config/gsm.mk)

# Inherit some common CM stuff.
$(call inherit-product, vendor/cm/config/common_full_phone.mk)

# Set build fingerprint / ID / Product Name ect.
PRODUCT_BUILD_PROP_OVERRIDES += PRODUCT_NAME=SK17i BUILD_FINGERPRINT="SEMC/SK17i_1254-2184/SK17i:4.0.4/4.1.B.0.431/UL5_3w:user/release-keys" PRIVATE_BUILD_DESC="SK17i-user 4.0.4 4.1.B.0.431 UL5_3w test-keys"

# Boot Animation
TARGET_SCREEN_HEIGHT := 480
TARGET_SCREEN_WIDTH := 320

# Device identifier. This must come after all inclusions
PRODUCT_NAME := cm_mango
PRODUCT_DEVICE := mango
