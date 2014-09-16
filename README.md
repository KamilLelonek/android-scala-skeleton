# Installation

## Java

Download [`JDK 8`](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your computer and install it afterwards.

Select `Accept License Agreement` radio button and choose corresponding version depending on your OS.

## Android

**1. Download Android Studio:**

Download Android Studio depending on your system (v0.8.0 is the newest version while creating this README).

- [OS X](http://dl.google.com/android/studio/install/0.8.0/android-studio-bundle-135.1245622-mac.dmg)
- [Windows](http://dl.google.com/android/studio/install/0.8.0/android-studio-bundle-135.1245622-windows.exe)
- [Linux](http://dl.google.com/android/studio/install/0.8.0/android-studio-bundle-135.1245622-linux.tgz)

Open `Android Studio` and download scala plugin under: Android Studio → Preferences → Plugins → Browse repositories… → Scala (CUSTOM LANGUAGES) → Install plugin → Restart Android Studio

**2. Download android packages**

Add Android SDK to environmental variables:

    echo "export ANDROID_HOME=/Applications/Android\ Studio.app/sdk" >> ~/.bash_profile
    echo "export PATH=/Applications/Android\ Studio.app/sdk/tools:/Applications/Android\ Studio.app/sdk/platform-tools:$PATH" >> ~/.bash_profile

To install all dependencies open `Android SDK Manager` by:

    android

And select the following stuff:

    * Tools
        - Android SDK Platform-tools (20)
        - Android SDK Build-tools (20)
    * Android 4.4.2 (API 19)
        - SDK Platform
    * Extras
        - Android Support Library
        - Google Play services

Click `Install 5 packages`, then choose `Android SDK License` root from expanding menu and select `Accept License`. Next choose `install`.

Installation may even take up to half an hour depending on your internet bandwidth.

After the whole operation you should see:

    Stopping ADB server succeeded.
    Starting ADB server succeeded.
    Done. 5 packages installed.
    Done loading packages.

Then please click `close` button and exit `Android SDK Manager`.

## Scala
    
To install Scala for OS X you may download it convenient as usual:

    brew install scala

For other operating systems you can find installer on [Scala website](http://www.scala-lang.org/download/).

## Emulator

1. Download [VirtualBox](https://www.virtualbox.org/wiki/Downloads) for your machine and install it.

2. Create an account on [Genymotion website](https://cloud.genymotion.com/page/customer/login/?next=/).

3. Download free version of `Genymotion` from [downloads page](https://cloud.genymotion.com/page/launchpad/download/) and run `Genymotion`.

4. Add new device as prompted 
    - `connect` in to access list of available devices
    - select `Google Nexus 5` and click `Next` button to download it
    - After successful download click `Finish` and then `Play` button to run `Android` simulator

     
## Run it

If you use `Android Studio`:

1. Open project in IDE
2. Click `Play` button on the toolbar
3. Select emulator in `Choose Device` window and click `OK` (you can also check to use it every time when launching app)
4. You should now see application in emulator.

If you prefer command line:

1. `cd` into project directory
2. `./gradlew build` or `./gradlew.bat build` depending on your OS
3. Install application on your emulator

        adb install -r app/build/outputs/apk/app-debug.apk
        adb shell am start -n com.example.android.scala/.MainActivity

## That's all

Now you should have configured environment and running application.
