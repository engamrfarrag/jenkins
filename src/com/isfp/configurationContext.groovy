package com.isfp

class configurationContext implements Serializable {
   static ProjectModel project   
   static setProject(projectname){
       project=projectFactory.createProject(projectname)
   }
 }