package org.grails.demo


import grails.rest.*
import grails.converters.*

class SiteSectionAdminController extends RestfulController<SiteSection> {
    SiteSectionAdminController(Class<SiteSection> resource) {
        super(resource)
    }
}
