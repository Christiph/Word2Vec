// import de.johoop.jacoco4sbt._
// import JacocoPlugin._

// set the name of the project
name := "WordVec2"

version := "0.1-SNAPSHOT"

organization := "WordVec2"

// set the Scala version used for the project
scalaVersion := "2.10.2"

resolvers += "Scala-Tools Maven2 Repository" at "https://oss.sonatype.org/content/groups/scala-tools"

resolvers += "IESLthirdparty" at "https://dev-iesl.cs.umass.edu/nexus/content/repositories/thirdparty/"

resolvers += "IESLsnapshots" at "https://dev-iesl.cs.umass.edu/nexus/content/repositories/snapshots/"

libraryDependencies += "cc.factorie" % "factorie" % "1.0-SNAPSHOT"

libraryDependencies += "log4j" % "log4j" % "1.2.17"


// add a test dependency on ScalaCheck
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"

//add test dependency on scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.2" % "test"

//add slf4j
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.6"

//add log4j
libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.4"

// reduce the maximum number of errors shown by the Scala compiler
maxErrors := 20

// increase the time between polling for file changes when using continuous execution
pollInterval := 1000

// append several options to the list of options passed to the Java compiler
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"

// set the initial commands when entering 'console' only
// initialCommands in console := "import com.kaopua.recall._"

// set the main class for packaging the main jar
// 'run' will still auto-detect and prompt
// change Compile to Test to set it for the test jar
// mainClass in (Compile, packageBin) := Some("com.kaopua.recall.Main")

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
// mainClass in (Compile, run) := Some("com.kaopua.recall.Main")

// set the main class for the main 'test:run' task
// mainClass in (Test, run) := Some("com.kaopua.recall.Main")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

// set the prompt (for this build) to include the project id.
shellPrompt in ThisBuild := { state => Project.extract(state).currentRef.project + "> " }

// set the prompt (for the current project) to include the username
shellPrompt := { state => System.getProperty("user.name") + "> " }

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// change the format used for printing task completion time
timingFormat := {
    import java.text.DateFormat
    DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
}

// only use a single thread for building
parallelExecution := false

// Execute tests in the current project serially
//   Tests from other projects may still run concurrently.
parallelExecution in Test := false

// Use Scala from a directory on the filesystem instead of retrieving from a repository
//scalaHome := Some(file("/home/user/scala/trunk/"))

// don't aggregate clean (See FullConfiguration for aggregation details)
aggregate in clean := false

// only show warnings and errors on the screen for compilations.
//  this applies to both test:compile and compile and is Info by default
logLevel in compile := Level.Info

// only show warnings and errors on the screen for all tasks (the default is Info)
//  individual tasks can then be more verbose using the previous setting
logLevel := Level.Info

// only store messages at info and above (the default is Debug)
//   this is the logging level for replaying logging with 'last'
persistLogLevel := Level.Info

// only show 10 lines of stack traces
traceLevel := 10

exportJars := true

// only show stack traces up to the first sbt stack frame
traceLevel := 0

// add SWT to the unmanaged classpath
// unmanagedJars in Compile += file("/usr/share/java/swt.jar")

// seq(oneJarSettings: _*)

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

// seq(jacoco.settings : _*)


