package org.grails.demo


import grails.rest.*
import grails.converters.*

class PersonAdminController extends RestfulController<Person> {

    PersonAdminController(Class<Person> resource) {
        super(resource)
    }
}
