# payara-micro-hazelcast-k8s
Example project for including hazelcast kuberbetes plugin

Trying to add the hazelcast-kubernetes-plugin to the payara-micro.jar with the maven assembly plugin.

Just execute a `mvn clean install` to reproduce the problem

Following exception is thrown:
```
[INFO] --- exec-maven-plugin:1.5.0:exec (payara-uber-jar) @ micro-hazelcast ---
Jun 12, 2017 3:49:04 PM fish.payara.micro.impl.UberJarCreator buildUberJar
INFO: Building Uber Jar... server.jar
Jun 12, 2017 3:49:04 PM fish.payara.micro.impl.UberJarCreator buildUberJar
SEVERE: Error creating Uber Jar /Users/llorenzen/work/develop/micro-hazelcast/target/server.jar
java.util.zip.ZipException: STORED entry where compressed != uncompressed size
        at java.util.zip.ZipOutputStream.putNextEntry(ZipOutputStream.java:220)
        at java.util.jar.JarOutputStream.putNextEntry(JarOutputStream.java:109)
        at fish.payara.micro.impl.UberJarCreator.buildUberJar(UberJarCreator.java:207)
        at fish.payara.micro.impl.PayaraMicroImpl.packageUberJar(PayaraMicroImpl.java:2101)
        at fish.payara.micro.impl.PayaraMicroImpl.main(PayaraMicroImpl.java:179)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at fish.payara.micro.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48)
        at fish.payara.micro.boot.loader.Launcher.launch(Launcher.java:107)
        at fish.payara.micro.boot.loader.Launcher.launch(Launcher.java:70)
        at fish.payara.micro.boot.PayaraMicroLauncher.main(PayaraMicroLauncher.java:79)
        at fish.payara.micro.PayaraMicro.main(PayaraMicro.java:358)
```
