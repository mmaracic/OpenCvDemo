//instalacija opencv jar-a u lokalni repozitorij
mvn install:install-file -Dfile="C:\opencv\build\java\opencv-330.jar" -DgroupId=opencv -DartifactId=opencv -Dversion=330 -Dpackaging=jar

//Postavljanje foldera iz kojega se loada nativna biblioteka (pod VM Options)
//System.setProperty(...) ne radi jer se ne mogu mijenjati parametri JVM-a nakon što je već pokrenut, mijenja se samo interna kopija
-Djava.library.path=C:\opencv\build\java\x64