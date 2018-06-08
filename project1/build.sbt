libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val project1 = project.in(file("."))
  .dependsOn(shared)

lazy val shared = RootProject(file("../shared"))