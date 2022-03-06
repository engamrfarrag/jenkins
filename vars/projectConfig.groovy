import com.isfp.ProjectModel
import groovy.json.JsonSlurper
def call(String projectname){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parseText(this.libraryResource("config.json"))
        def project= config[projectname]
        return new ProjectModel(project)
}