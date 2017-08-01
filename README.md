# html-2-apk
The simplest method for converting your HTML app to a working Android App.
There are lot of frontend engineers want to convert their own html app to android app,but all the existing methods are too truoblesome,or some methods need you to purchase a software.
Now,do it my way,you do not have to install JDK,you do not have to install Android SDK,you do not have to install eclipse or Android Studio and PhoneGap,and you don't need to spend money.More importantly than all of that,this is easy and simple.You can complete it in 10 minutes!Now,let's begin.

##Tool

First you'll need AIDE installed in your mobile phone.To be easy,it's the only tool we will use in this tutorial.
<br >
Open you mobile application store,search 'AIDE',and install it.
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/02.png)
##Create new app
<br >
Open AIDE,
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/03.png)
<br >
click 'For Exports',
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/04.png)
<br >
click 'New Android App',
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/05.png)
<br >
click 'CREACT',
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/06.png)
<br >
Now,you have created a new android project.The project's home directory is the /AppProjects/MyApp directory in your phone.
##Modify file
Download files I had provided.
<br >
```git clone https://github.com/ymrdf/html-2-apk```
<br >
Open up /AppProjects/MyApp/app/src/main using your file browser,replace 'AndroidManifest.xml' with the file of the same name which you just download.
<br >
Next ,replace /AppProjects/MyApp/app/src/main/java/com/mycompany/myapp/MainActivity.java.
<br >
Next ,replace /AppProjects/MyApp/app/src/main/res/layout/main.xml.
<br >
At last,copy the 'assets' folder into /AppProjects/MyApp/app/src/main.There is a sample html app in assets/www,you can replace it with your own.Only one thing to note,the html file must be 'index.html'.
##Test
Now,you can see the effect.
<br >
Back to AIDE,click the triangular bitton,
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/07.png)
<br>
click install,You should see a new app in your device like this.
<br>
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/13.png)
<br>
OK,you have successfully converted your html app to android app,and have installed it on your devices.Your '.apk' file is in /AppProjects/MyApp/app/build/bin/.
##Building the APK for Release
Its time for you to deploy your Android app and get it into your users' hands.
<br >
Back to AIDE,tap Menu button,
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/09.png)
<br >
tap 'project',
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/14.png)
<br >
tap 'publish project'.
<br >
![](https://github.com/ymrdf/html-2-apk/raw/master/pic/15.png)



