package com.isfp
import groovy.json.JsonSlurper

class ProjectModel implements Serializable {
    def _context
    ProjectModel(context){
        this._context=context

    }
    def readConfig(name){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parse(this.libraryResource("config.json"))
        return config[name]
    }
 }