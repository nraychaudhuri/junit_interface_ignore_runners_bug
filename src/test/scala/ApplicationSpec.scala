package test

import org.specs2.mutable._
import org.junit.runner.RunWith

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[org.specs2.runner.JUnitRunner])
class ApplicationSpec extends Specification {
  
  "Application" should {
    
    "send 404 on a bad request" in {
       1 === 1
    }
  }
}