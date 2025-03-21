# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!

SRC_URI = "git://github.com/nikeokoronkwo/agl_gsoc_app.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=ee1fad90478815ab9ccbf7cf41488c3b"
PV = "1.0"

SUMMARY = "AGL GSoC Application"
DESCRIPTION = "AGL GSoC Flutter Application Recipe"
AUTHOR = "Nikechukwu Okoronkwo"
SECTION = "graphics"

PUBSPEC_APPNAME = "agl_gsoc25_quiz_app"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app
