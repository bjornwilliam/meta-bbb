SUMMARY = "A Qt5 development image"
HOMEPAGE = "http://www.jumpnowtek.com"
inherit populate_sdk_qt5
require console-image.bb

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
"

QT_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
    qt5-env \
    qtserialport \
"

QT5_PKGS = " \
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtsensors-plugins \
    qtserialbus \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtvirtualkeyboard-dev \
    qtxmlpatterns \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-calibrate \
    tslib-conf \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_DEV_TOOLS} \
    ${QT_TOOLS} \
    qcolorcheck-tools \
    ${TSLIB} \
    tspress-tools \
    ${QT5_PKGS} \
    ti-sgx-ddk-um \
    omapdrm-pvr \
"

export IMAGE_BASENAME = "qt5-image"
