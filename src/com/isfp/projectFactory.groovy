package com.isfp
import groovy.json.JsonSlurper
class projectFactory implements Serializable {
    
   static createProject(projectName){
    def jsonSlurper = new JsonSlurper()
    def config = jsonSlurper.parseText(this.libraryResource("config.json"))
    def projectJSON= config[projectname]
    def project = new ProjectModel()
    project.buildNode=projectJSON.buildNode
    return project
   }

    
 }