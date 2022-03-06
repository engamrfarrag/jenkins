import com.isfp.ProjectModel
def call(String projectname){
    def project = new ProjectModel(this)
    return project.readConfig(projectname)
}