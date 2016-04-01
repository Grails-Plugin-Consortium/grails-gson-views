package org.grails.demo


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Person {

    String name

}