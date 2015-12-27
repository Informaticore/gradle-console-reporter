package com.github.ksoichiro.cosole.reporter

import org.gradle.api.GradleException
import spock.lang.Specification

class ConsoleReporterExtensionSpec extends Specification {
    def configureByMethodMissing() {
        setup:
        def extension = new ConsoleReporterExtension()
        when:
        extension.with {
            junit {
                enabled true
            }
        }

        then:
        notThrown(GradleException)
    }

    def cannotConfigureByMethodMissing() {
        setup:
        def extension = new ConsoleReporterExtension()
        when:
        extension.with {
            unknownProperty {
            }
        }

        then:
        thrown(GradleException)
    }
}
