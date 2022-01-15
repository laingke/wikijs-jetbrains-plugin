package com.github.laingke.wikijsjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.laingke.wikijsjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
