package org.grails.demo

class Site {

    String name

    static constraints = {
    }

    transient getSiteSections(){
        SiteSection.findAllBySite(this)
    }

    transient getPersons(){
        Person.findAllBySite(this)
    }
}
