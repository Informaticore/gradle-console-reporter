package com.github.ksoichiro.console.reporter.report.junit

import groovy.transform.ToString

@ToString
class JUnitFailure {
    String message
    String type
    String description
}