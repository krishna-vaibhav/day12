What is Maven ?

Build tool for overall project management.
Vendor -- Apache

Why ?
To ease the build process of a project.


Earlier build tool -- Ant Vendor
 Apache. 

Ant disadvantages 
1. While using ant , project structure had to be defined in build.xml. Maven has a convention to place source code, compiled code etc. So no need to provide information about the project structure in pom.xml file.

2. 
Maven is declarative, everything you define in the pom.xml file.
No such support in ant.

3. 
There is no life cycle in Ant, where as  life cycle exists in Maven.
Maven is a  framework  ,  mainly for  project management.

Installation (w/o IDE)
1. Download Maven from Apache (version 3.x)
2. Add MAVEN_HOME as environment variable
3. Add maven/bin under path (for easy accessibility)
4.Verify maven
  mvn -- version 
  
  OR use m2e plug-in (a standard part of Eclipse for J2EE)

What is a Maven Repository

A maven repository is a directory of packaged JAR file with pom.xml file. Maven searches for dependencies(JARs) in the repositories. There are 3 types of maven repository:

    Local Repository
    Central Repository
    Remote Repository

Maven searches for the dependencies in the following order:

Local repository then Central repository then Remote repository.
maven repositories

If dependency is not found in these repositories, maven stops processing and throws an error.

1. Maven Local Repository

Maven local repository is located in the  file local system. It is created by the maven when you run any maven command.

By default, maven local repository is HOME / .m2 directory. 
(Can be updated  by changing the  MAVEN_HOME/conf/settings.xml)

2) Maven Central Repository

Maven central repository is located on the web(Created by the apache maven community)

The path of central repository is: http://repo1.maven.org/maven2/.

Contains a lot of common libraries that can be viewed by this url http://search.maven.org/#browse.

3) Maven Remote Repository

Maven remote repository is also located on the web. Most of libraries can be missing from the central repository such as JBoss library etc, so we need to define remote repository in pom.xml file.


Maven pom.xml file

POM is an acronym for Project Object Model.

Contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc.

Maven reads the pom.xml file, then executes the goal.


Elements of maven pom.xml file


1. project	It is the root element of pom.xml file.
2. modelVersion	It is the sub element of project. It specifies the modelVersion. It should be set to 4.0.0.
3. groupId	It is the sub element of project. It specifies the id for the project group.
4. artifactId	It is the sub element of project. It specifies the id for the artifact (project). An artifact is something that is either produced or used by a project. Examples of artifacts produced by Maven for a project include: JARs, source and binary distributions, and WARs.
5. version	It is the sub element of project. It specifies the version of the artifact under given group.


Additionally , it can have :


packaging --	defines packaging type such as jar, war etc.
name --	defines name of the maven project.
plugins    ---compiler plugins , eclipse plugins
dependencies  -- collection of dependencies for this project.
Witin that -- 
dependency  --  defines a specific dependency. 
scope  --	defines scope for this maven project. It can be compile, provided, runtime, test and system.

More details
What is an artifact n group ?
An artifact is a file, usually a JAR/WAR, that gets deployed to a Maven repository.

A Maven build produces one or more artifacts, such as a compiled JAR and a "sources" JAR.

Each artifact has a group ID (usually a reversed domain name, like com.example.foo), an artifact ID (just a name), and a version string. The three together uniquely identify the artifact.

A project's dependencies are specified as artifacts.
What is POM ?
A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project. It contains default values for most projects. Examples for this is the build directory, which is target; the source directory, which is src/main/java; the test source directory, which is src/test/java; and so on.

