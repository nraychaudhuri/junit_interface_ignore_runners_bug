libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M2" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "1.13" % "test"

scalaVersion := "2.10.0"

testOptions in Test += Tests.Argument("junitxml", "console", "--ignore-runners=org.specs2.runner.JUnitRunner")
