import spock.lang.Specification

/**
 * Created by ashishw on 23/1/16.
 */

class SampleSpec extends Specification
{
    def "first case"(){
        given:
            int i=0
        when:
            i=i+3
        then:
            i == 3
    }
}