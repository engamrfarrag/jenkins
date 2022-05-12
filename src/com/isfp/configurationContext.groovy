package com.isfp

class configurationContext {
   static ProjectModel project  =new ProjectModel() 
   static setProject(config,projectName){
        def projectJSON= config[projectName]
        project.buildNode=projectJSON.buildNode
        project.srcDirectory=projectJSON.srcDirectory
        project.patchPath=projectJSON.backupPath
        project.appDirectory=projectJSON.patchPath
        def replacments =projectJSON.replacementFiles
     for(rep in replacments) {
      project.replacement.add(new Replacement(rep['src'],rep['dst']))
      }
   }
 }