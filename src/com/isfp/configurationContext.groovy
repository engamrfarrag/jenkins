package com.isfp

class configurationContext {
   static ProjectModel project   
   static setProject(config,projectName){
        def projectJSON= config[projectName]
        def project = new ProjectModel()
        project.buildNode=projectJSON.buildNode
   }
 }