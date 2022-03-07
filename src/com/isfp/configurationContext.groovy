package com.isfp

class configurationContext {
   static ProjectModel project  =new ProjectModel() 
   static setProject(config,projectName){
        def projectJSON= config[projectName]
        project.buildNode=projectJSON.buildNode
   }
 }