package org.grails.demo

import grails.rest.Resource

@Resource(uri = '/persons', readOnly = false, formats = ['json', 'xml'])
class Person {

    String name

}