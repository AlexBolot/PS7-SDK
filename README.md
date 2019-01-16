SDK is now functional for Theme plugins !

Requirements for plugin developers : 
- Your plugin classes must extend `ThemePlugin` to be able to communicate with the Theme API (`ThemeExtensionPoint`).
- The plugin has to be a .jar file, but formatted using a dex format. To do so, simply use the `dx` tool given with the Android SDK :
`dx --dex --output="MyPluginDex.jar" "MyPlugin.jar"`

Note 1 : The `dx` tool is located at `{your/path/to}/Android/sdk/build-tools/{your-sdk-version}/dx`
Note 2 : The name of both .jar do not matter, they just need to be different when you use the command, to avoid file creation problems. You are free to rename it as you want afterwards
