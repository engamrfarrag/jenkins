import com.isfp.configurationContext

def call(String projectname){
        configurationContext.setProject(projectname)
        return configurationContext.project
}