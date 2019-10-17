require linux-stable.inc

COMPATIBLE_MACHINE = "beaglebone"

KERNEL_DEVICETREE ?= " \
    am335x-boneblack.dtb \
    am335x-boneblack-wireless.dtb \
    am335x-boneblue.dtb \
    am335x-bonegreen.dtb \
    am335x-bonegreen-wireless.dtb \
    bbb-nohdmi.dtb \
    bbb-4dcape50t.dtb \
    pwm_P8_13.dtb   \
"

LINUX_VERSION = "4.19"
LINUX_VERSION_EXTENSION = "-jumpnow"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"
PR = "r1"
PV = "4.19.79"
SRCREV = "dafd634415a7f9892a6fcc99c540fe567ab42c92"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
    file://0001-spidev-Add-a-generic-compatible-id.patch \
    file://0002-dts-Remove-bbb-cape-i2c-definitions.patch \
    file://0003-wlcore-Change-NO-FW-RX-BA-session-warnings-to-debug.patch \
    file://0004-Add-pwm-output-p8_13.patch \
    file://0005-dts-Add-custom-dts-files.patch \
    file://0006-Add-dts-for-4dcape-5-inch-resistive-touch-display.patch \
"
