def call(){
    dir(configurationContext.project.srcDirectory){
        sh "mvn clean install"
    }
}