import org.grails.demo.Person

class BootStrap {

    def init = { servletContext ->
        new Person(name: 'This').save()
        new Person(name: 'Should').save()
        new Person(name: 'Probably').save()
        new Person(name: 'Work').save()
        new Person(name: '... Maybe?').save()
    }
    def destroy = {
    }
}
