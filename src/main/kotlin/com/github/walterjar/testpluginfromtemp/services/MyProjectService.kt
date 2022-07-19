package com.github.walterjar.testpluginfromtemp.services

import com.intellij.openapi.project.Project
import com.github.walterjar.testpluginfromtemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
