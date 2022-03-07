
def svnUpdate(){
 def svnfiles=sh (returnStdout : true , script :'cd ${configurationContext.project.srcDirectory}  && svn up').split('\n')
 if(svnfiles > 2){
     return true
 }
}
def svnSearch(patchVersion){

}