package com.isfp
class ProjectModel implements Serializable {
   
    String buildNode
    String buildDirectory
    String appDirectory
    ProjectModel(project){
        this.buildNode=project.buildNode
        this.buildDirectory=project.buildDirectory
        this.appDirectory=project.appDirectory
    }

 }