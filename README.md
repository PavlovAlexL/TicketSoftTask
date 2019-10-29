##ProjectOne - my first REST-full API.

### Installation
1. Install JDK 1.8
2. Add local variables
Name: ```JAVA_HOME```, Value:```C:\Program Files\Java\jdk1.8.0_131```
and add to path:```;%JAVA_HOME%\bin```
Check installation:in cmd ```echo %JAVA_HOME%```
You must get ```java -version```
3. Install maven http://apache-mirror.rbc.ru/pub/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz
Extract archive to c:/maven, or other.
add local variables:Name:```M2_HOME```, Value:```c:/maven```
add to path:```;%M2_HOME%\bin```
Check installation: in cmd ```mvn --version```
3. Start the project:
    open console on project path, and run ```mvn clean install```
    after successful build project, you can run ```mvn exec:java -Dexec.mainClass=StartUI```
4. Import to Intellij IDEA
File->Open
Change pom.xml in the root project path
Ok->Open as Project

###Using
You must use only required commands:
Menu:
1. Add a user in the format Name -> email, email ...
2. Get the result
3. Clear the result
4. Finish the job






