package com.github.balticbb.decisionflow.services

import com.intellij.openapi.project.Project
import com.github.balticbb.decisionflow.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
