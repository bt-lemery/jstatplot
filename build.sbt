
organization := "zamblauskas"

name := "jstatplot"

version := "0.6.0"

scalaVersion := "2.11.7"

resolvers += Resolver.bintrayRepo("zamblauskas", "maven")

libraryDependencies ++= Seq(
  "zamblauskas"       %% "scalaplot"        % "0.3",
  "zamblauskas"       %% "scala-csv-parser" % "0.7.0",
  "com.twitter"       %% "util-core"        % "6.30.0",
  "com.github.scopt"  %% "scopt"            % "3.3.0",
  "org.scalaz"        %% "scalaz-effect"    % "7.2.0"
)

enablePlugins(JavaAppPackaging)