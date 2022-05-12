import com.isfp.configurationContext
def call(){
    dir(configurationContext.project.srcDirectory){
        sh "mvn clean install"
        sh 'pwd'
    }
}