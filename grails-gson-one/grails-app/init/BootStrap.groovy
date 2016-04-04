import org.grails.demo.Person
import org.grails.demo.Site
import org.grails.demo.SiteSection

class BootStrap {

    def init = { servletContext ->

        Site defaultSite = new Site(name: 'Default Site').save()
        SiteSection defaultSection = new SiteSection(name: 'Default Section', site: defaultSite).save()
        Person graeme = new Person(name: 'Graeme', site: defaultSite).save()

    }
    def destroy = {
    }
}
