package com.github.constfold.rustfmtsuki.services

import com.intellij.openapi.project.Project
import com.github.constfold.rustfmtsuki.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
