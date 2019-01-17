SDK is now functional for Theme plugins !

### 1. To obtain and use the SDK :
 #### 1.1 Local download : 
   You can download the `.jar` file of the SDK using [this](https://github.com/AlexBolot/PS7-SDK/releases/download/release-1.2/polymyseum-sdk-1.2.jar) link

 #### 1.2 Using a dependency :
   You can also go to [jitpack.io](https://jitpack.io/#AlexBolot/PS7-SDK) and follow the 'How to', to obtain the desired release of our SDK

### 2. Requirements for plugin developers : 
- Your plugin classes must extend `ThemePlugin` to be able to communicate with the Theme API (`ThemeExtensionPoint`).
- The plugin has to be a .jar file, but formatted using a dex format. To do so, simply use the `dx` tool given with the Android SDK :
`dx --dex --output="MyPluginDex.jar" "MyPlugin.jar"`

Note 1 : The `dx` tool is located at `{your/path/to}/Android/sdk/build-tools/{your-sdk-version}/dx`
Note 2 : The name of both .jar do not matter, they just need to be different when you use the command, to avoid file creation problems. You are free to rename it as you want afterwards
