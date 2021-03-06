
include images/cubox-basic-image.bb

inherit core-image populate_sdk populate_sdk_qt5

IMAGE_FEATURES += "ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "wpa-supplicant"

SDKIMAGE_FEATURES += "dbg-pkgs"

IMAGE_INSTALL += " \
    nano \
    openssl \
    openssh-sftp-server \
    i2c-tools \
    openssl \
    usbutils \
    grep \
    findutils \
    gdbserver \
    rsync \
    strace \
    util-linux \
    nano \
    libosbase \
    libiotty \
    capnproto \
    udev-automount \
    kmscube3d \
    busybox-syslog \
"

#
TOOLCHAIN_TARGET_TASK_append = " \
     kernel-devsrc \
     util-linux-dev \
     libosbase-dev \
     libiotty-dev \
     capnproto-dev\
"
