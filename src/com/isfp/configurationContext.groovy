package com.isfp

class configurationContext {
   static ProjectModel project   
   static setProject(projectname){
       project=projectFactory.createProject(projectname)
   }
 }