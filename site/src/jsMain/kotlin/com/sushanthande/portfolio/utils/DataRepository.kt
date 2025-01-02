package com.sushanthande.portfolio.utils

import com.sushanthande.portfolio.models.SkillItem

object DataRepository {
    fun getSkills() = ArrayList<SkillItem>().apply {
        add(SkillItem(drawable = Res.Drawable.ANDROID, title = "Android"))
        add(SkillItem(drawable = Res.Drawable.JAVA, title = "Java"))
        add(SkillItem(drawable = Res.Drawable.KOTLIN, title = "Kotlin"))
        add(SkillItem(drawable = Res.Drawable.ANDROID_JETPACK, title = "Android Jetpack"))
        add(SkillItem(drawable = Res.Drawable.JETPACK_COMPOSE, title = "Jetpack Compose"))
        add(SkillItem(drawable = Res.Drawable.KOTLIN_MULTIPLATFORM, title = "Kotlin Multiplatform"))
        add(SkillItem(drawable = Res.Drawable.JSON, title = "JSON"))
        add(SkillItem(drawable = Res.Drawable.FIGMA, title = "Figma"))
        add(SkillItem(drawable = Res.Drawable.FIREBASE, title = "Firebase"))
        add(SkillItem(drawable = Res.Drawable.GIT, title = "Git"))
        add(SkillItem(drawable = Res.Drawable.HTML, title = "HTML"))
        add(SkillItem(drawable = Res.Drawable.ANDROID_STUDIO, title = "Android Studio"))
        add(SkillItem(drawable = Res.Drawable.INTELLIJ, title = "IntelliJ"))
        add(SkillItem(drawable = Res.Drawable.POSTMAN, title = "Postman"))
        add(SkillItem(drawable = Res.Drawable.VSCODE, title = "VSCode"))
        add(SkillItem(drawable = Res.Drawable.MARKDOWN, title = "Markdown"))
    }
}