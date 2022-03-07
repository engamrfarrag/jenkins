import com.isfp.configurationContext

def svnUpdate(){
    def dir = configurationContext.project.srcDirectory
    echo dir
    def svnfiles=sh (returnStdout : true , script :'cd $dir  && svn up').split('\n')
    if(svnfiles.size > 2){
        return true
    }
}
def svnSearch(patchVersion){

}