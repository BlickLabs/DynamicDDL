/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'jresendiz' at '4/20/17 11:17 PM' with Gradle 3.0
 *
 * @author jresendiz, @date 4/20/17 11:17 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
