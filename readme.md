Run this from the root directory

`./gradlew :grails-gson-one:assemble`

Expand the created jar file

Observe that the sitePage.gson is compiled but left in the `/templates/common` directory and not copied to the root scope like the other templates. 
 
![screen shot](https://raw.githubusercontent.com/Grails-Plugin-Consortium/grails-gson-views/multi-project/screen.png)