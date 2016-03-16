#Android - the basics

This is a guide through of basics Android environment. The tutorial is made for students in Digit ry's code club in the University of Turku. The *README.md* contains useful links to resources and guides for getting started with Android development. 

The repository itself will contain a basic Android application which is structured by following various examples online and mainly using Google's Material design principles. 

##Who?
> My name is Sami Nieminen and I am a fourth year student in the *Bachelor of Science in Technology Degree Programme* in the University of Turku. I have worked with various programming technologies and frameworks besides Android like Angularjs and other libraries in MEAN-stack and with Python as well.
>I have worked almost a year in the Technology Research Center in Turku as an Android developer. My expertise has mainly come from books, online tutorials and blog posts. Here I try to give you guys an overview on marvelous Android. Remember that I am not an expert and don't hesitate to give any feedback about my code or my English spelling. 

##What shall we do?
1. First of all we'll learn to use Android Studio. It has plenty of great shortcuts and refactoring tools which helps developer to concentrate on thinking the logic rather than typing hundreds of lines of 
2. Something great
3. More good things
4. You know everything
5. I'll update the list soon


##Android Studio shortkeys 
[List of all Android Studio shortkeys](https://resources.jetbrains.com/assets/products/intellij-idea/IntelliJIDEA_ReferenceCard.pdf) 
> Can be accessed from within Android Studio:  Top Toolbar -> Help -> Default Keymap Reference

[Key maps with explanations (Win/Linux/Os)](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-1/)

###Most useful shorkeys 
Key 	 | Definition
-------- | ---
ctrl + / | Comment/uncomment
ctrl + shift + / | Comment/uncomment with block comment
ctrl + Q | Quick documentation lookup  
ctrl + alt + L | Reformat code
ctrl + shift + N | Search and open project file
ctrl + alt  + T | Surround with... (if..else, try..catch, for, synchronized, etc.)
ctrl + shift + I | Quick lookup of the method
shift + F6 | Rename (parameter, method, etc)

##Getting started
Create new project with blank Activity

###Dependencies and libraries
Inside the `Project panel` (usually on the left side of the view) select from the dropdown menu `Android`. 
It opens up `App` and `Gradle Scripts`. Inside `App` there are all project Java and XML files. 
`Gradle Scritps`are automatically generated files and shouldn't be changed by default. Exception is when you want to add libraries to you project. External libraries can be added to the project by using Gradle. 
```java

// Include this to the build.gradle (Module: App) file
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.1.1'
    compile 'com.android.support:appcompat-v7:23.1.1'
    compile 'com.android.support:appcompat-v7:23.1.1'
    compile 'com.android.support:cardview-v7:23.1.1'
    compile 'com.android.support:recyclerview-v7:23.1.1'
    compile 'me.zhanghai.android.materialprogressbar:library:1.0.2'
}
```
These lines add nice set of support libraries to the project which basically allows programmer to create applications with new Material design components to smartphones with operating system earlier than Lollipop (Android 5.0).

###Resource files
####Colors
Material design needs few certain preset colors:
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
  <color name="primary">#2196F3</color>
  <color name="primary_dark">#1976D2</color>
  <color name="primary_light">#BBDEFB</color>
  <color name="accent">#FFEB3B</color>
  <color name="primary_text">#212121</color>
  <color name="secondary_text">#727272</color>
  <color name="icons">#FFFFFF</color>
  <color name="divider">#B6B6B6</color>
</resources>
```
[Material Pallette](https://www.materialpalette.com/blue/yellow) generates colors automatically. 

####Strings
I often use a lot of same words in my applications
```xml
<resources>
    <string name="app_name">KoodikerhoApp</string>
    <string name="cancel">Cancel</string>
    <string name="start">Start</string>
    <string name="stop">Stop</string>
    <string name="new_text">New</string>
    <string name="remove">Remove</string>
    <string name="add">Add</string>
    <string name="welcome">Welcome</string>
    <string name="getting_started">Let\'s Get Started</string>
</resources>
```


##Great Android resources
Here are some of my favorite books and online resources that will get you started: 

* Books
  * [Android Programming: The Big Nerd Ranch Guide 2nd Edition](https://www.bignerdranch.com/we-write/android-programming/) Great one to begin with. It basically starts from zero and in each chapter you build a working application
  * [Professional Android 4 Application Development](http://www.wrox.com/WileyCDA/WroxTitle/Professional-Android-4-Application-Development.productCd-1118102274.html) If you want to know more ;)
  * [Enterprise Android: Programming Android Database Applications for the Enterprise](http://eu.wiley.com/WileyCDA/WileyTitle/productCd-1118183495.html) More advanced next level resource

* Websites 
  * [StackOverflow](http://stackoverflow.com/) and Google will be your best friends!
  * [Android developers](http://developer.android.com/training/index.html) Place where you should start looking for information. Some examples might be a bit outdated but API is clear and wide
  * [Google Developers](https://www.youtube.com/channel/UC_x5XG1OV2P6uZZ5FSM9Ttw) Google offers great videos e.g. from Google I/O events from past years. Totally worth checking out. 
  * [Android Hive](http://tips.androidhive.info/) High quality tutorials although doesn't have many
  * [Android Arsenal](https://android-arsenal.com/free) Contains huge variety of premade Android libraries and tools. Do not reinvent the wheel. Most of the resources can be installed directly using Gradle inside the Android Studio.
  * [Android Code Style Rules](http://source.android.com/source/code-style.html) Gives you an overview about what are naming conventions and rules in Android 
