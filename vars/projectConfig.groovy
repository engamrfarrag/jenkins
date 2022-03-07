import com.isfp.*

def call(String projectname){
        configurationContext.setProject(projectname)
        return configurationContext.project
}