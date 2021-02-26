resolvers += Resolver.url("Sona type repo", url("https://oss.sonatype.org/content/repositories/public"))( Patterns("[organisation]/[module]/[revision]/[artifact].[ext]") )
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.21")
