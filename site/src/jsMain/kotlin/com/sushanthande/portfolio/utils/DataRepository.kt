package com.sushanthande.portfolio.utils

import com.sushanthande.portfolio.models.ExperienceItem
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

    fun getExperiences() = ArrayList<ExperienceItem>().apply {
        add(
            ExperienceItem(
                designation = "Senior Software Engineer",
                employerName = "HSBC",
                duration = "Sept 23 - Sept 24",
                logo = Res.Drawable.HSBC
            )
        )
        add(
            ExperienceItem(
                designation = "Senior Software Engineer",
                employerName = "Bajaj Markets",
                duration = "Sept 21 - Sept 23",
                logo = Res.Drawable.BAJAJ_MARKETS
            )
        )
        add(
            ExperienceItem(
                designation = "Software Engineer",
                employerName = "Entrata",
                duration = "July 18 - Sept 21",
                logo = Res.Drawable.ENTRATA
            )
        )
        add(
            ExperienceItem(
                designation = "Software Engineer",
                employerName = "Veracity Software",
                duration = "OCt 17 - June 18",
                logo = Res.Drawable.VERACITY_SOFTWARE
            )
        )
    }
}