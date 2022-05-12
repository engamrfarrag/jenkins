package com.isfp
class ProjectModel implements Serializable {
    ProjectModel(){
    }
    String buildNode
    String appDirectory
    String srcDirectory
    String backupPath
    String patchPath
    String[] blockList
    List<Replacement> replacement
    
 }