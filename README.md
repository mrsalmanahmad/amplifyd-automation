# amplifyd-automation
## Tools needed
- Android Studio
- Appium
- IntelliJ

## Android Studio
### Installation
To install Android Studio on Windows, proceed as follows:

- If you downloaded an .exe file (recommended), double-click to launch it.
- If you downloaded a .zip file, unpack the ZIP, copy the android-studio folder into your Program Files folder, and then open the android-studio > bin folder and launch studio64.exe (for 64-bit machines) or studio.exe (for 32-bit machines).
- Follow the setup wizard in Android Studio and install any SDK packages that it recommends.

### Configure Android Studio
Android Studio provides wizards and templates that verify your system requirements, such as the Java Development Kit (JDK) and available RAM, and configure default settings, such as an optimized default Android Virtual Device (AVD) emulation and updated system images. This document describes additional configuration settings you may want to use to customize your use of Android Studio.

Make sure to have JDK and SDK
### - Set the JDK version
- A copy of the latest OpenJDK comes bundled with Android Studio 2.2 and higher, and this is the JDK version we recommend you use for your Android projects. To use the bundled JDK, do the following:
- Open your project in Android Studio and select File > Project Structure in the menu bar.
- In the SDK Location page and under JDK location, check the Use embedded JDK checkbox.
- Click OK.

### - Android SDK
Follow these steps:
- In Android Studio, open the Settings dialog (Preferences on macOS), then navigate to Appearance & Behavior > System Settings > Android SDK.
- Change the value of Android SDK Location to C:\WorkFolder\AndroidSDK.
SET JDK and SDK as ENVIRONMENT VARIABLE (system variable and add to path)

## Appium
### Requirements:
- Android SDK ≥ 16

### Installation
Appium can be installed in one of two ways: via NPM or by downloading Appium Desktop, which is a graphical, desktop-based way to launch the Appium server.

- Installation via NPM
If you want to run Appium via an npm install, hack with Appium, or contribute to Appium, you will need Node.js and NPM (use nvm, n, or brew install node to install Node.js. Make sure you have not installed Node or Appium with sudo, otherwise you'll run into problems). We recommend the latest stable version, though Appium supports Node 10+.
The actual installation is as simple as:
- npm install -g appium
Installation via Desktop App Download
Simply download the latest version of Appium Desktop from the releases page.
(https://github.com/appium/appium-desktop/releases)

### Verifying the Installation
To verify that all of Appium's dependencies are met you can use appium-doctor. Install it with npm install -g appium-doctor, then run the appium-doctor command, supplying the --ios or --android flags to verify that all of the dependencies are set up correctly.

### Prerequisites
- We'll assume you have an Android 8.0 emulator configured and running (the example will work on lower versions, just fix the version numbers accordingly)
- We'll assume you have this test APK downloaded and available on your local filesystem

### Capabilties JASON
{
  "deviceName": "emulator-5554",
  "platformName": "android",
  "appPackage": "com.logicon.amplifyd.debug",
  "appActivity": "com.logicon.amplifyd.activities.prelogin.SplashActivity",
  "noReset": true
}

## IntelliJ IDEA Community Edition
Install MAVEN
https://www.youtube.com/watch?v=N7vY3cPSo8g&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=7

# ENVIRONMENT VARIABLE
- ANDROID_SDK-ROOT: G:\android_SDK\platform-tools
- JAVA-HOME: C:\Program Files\Java\jdk-14\
- IntelliJ IDEA Community Edition: G:\IntelliJ\IntelliJ IDEA Community Edition 2020.2\bin;
- MAVEN-HOME C:\apache-maven-3.6.3\bin
