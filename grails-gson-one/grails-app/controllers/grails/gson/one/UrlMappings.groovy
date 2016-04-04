package grails.gson.one

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/sites"(resources: 'siteAdmin')
        "/sections"(resources: 'sectionAdmin')
        "/persons"(resources: 'personAdmin')

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
