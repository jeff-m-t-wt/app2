package fake.builds.app2

import fake.builds.core.CoreThing
import fake.builds.lib1.Lib1Thing

object Main extends App {

  println((new CoreThing).info)
  println((new Lib1Thing).info)
  println("I don't depend on lib2")

}
