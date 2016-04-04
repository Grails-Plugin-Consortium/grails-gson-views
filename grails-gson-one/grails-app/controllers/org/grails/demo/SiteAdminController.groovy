package org.grails.demo

import grails.rest.RestfulController

class SiteAdminController extends RestfulController<Site> {

    SiteAdminController(Class<Site> resource) {
        super(resource)
    }
}
