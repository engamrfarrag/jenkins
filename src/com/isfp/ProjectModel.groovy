package com.isfp
class ProjectModel implements Serializable {
    ProjectModel(){
        replacement=new ArrayList<Replacement>()
    }
    String buildNode
    String appDirectory
    String srcDirectory
    String backupPath
    String patchPath
    String[] blockList
    List<Replacement> replacement
    
 }