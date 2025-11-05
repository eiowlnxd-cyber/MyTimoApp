#!/bin/sh
set -e
DIR=`dirname "$0"`
java -cp "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
