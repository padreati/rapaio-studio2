package com.github.padreati.rapaiostudio2.services

import com.intellij.openapi.project.Project
import com.github.padreati.rapaiostudio2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
