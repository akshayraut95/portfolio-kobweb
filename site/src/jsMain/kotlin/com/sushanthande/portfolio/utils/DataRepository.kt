package com.sushanthande.portfolio.utils

import com.sushanthande.portfolio.models.ExperienceModel
import com.sushanthande.portfolio.models.ProjectModel
import com.sushanthande.portfolio.models.SkillModel

object DataRepository {
    fun getSkills() = ArrayList<SkillModel>().apply {
        add(SkillModel(drawable = Res.Drawable.ANDROID, title = "Android"))
        add(SkillModel(drawable = Res.Drawable.JAVA, title = "Java"))
        add(SkillModel(drawable = Res.Drawable.KOTLIN, title = "Kotlin"))
        add(SkillModel(drawable = Res.Drawable.ANDROID_JETPACK, title = "Android Jetpack"))
        add(SkillModel(drawable = Res.Drawable.JETPACK_COMPOSE, title = "Jetpack Compose"))
        add(SkillModel(drawable = Res.Drawable.KOTLIN_MULTIPLATFORM, title = "Kotlin Multiplatform"))
        add(SkillModel(drawable = Res.Drawable.JSON, title = "JSON"))
        add(SkillModel(drawable = Res.Drawable.FIGMA, title = "Figma"))
        add(SkillModel(drawable = Res.Drawable.FIREBASE, title = "Firebase"))
        add(SkillModel(drawable = Res.Drawable.GIT, title = "Git"))
        add(SkillModel(drawable = Res.Drawable.HTML, title = "HTML"))
        add(SkillModel(drawable = Res.Drawable.ANDROID_STUDIO, title = "Android Studio"))
        add(SkillModel(drawable = Res.Drawable.INTELLIJ, title = "IntelliJ"))
        add(SkillModel(drawable = Res.Drawable.POSTMAN, title = "Postman"))
        add(SkillModel(drawable = Res.Drawable.VSCODE, title = "VSCode"))
        add(SkillModel(drawable = Res.Drawable.MARKDOWN, title = "Markdown"))
    }

    fun getExperiences() = ArrayList<ExperienceModel>().apply {
        add(
            ExperienceModel(
                designation = "Senior Software Engineer",
                employerName = "HSBC",
                duration = "Sept 23 - Sept 24",
                logo = Res.Drawable.HSBC
            )
        )
        add(
            ExperienceModel(
                designation = "Senior Software Engineer",
                employerName = "Bajaj Markets",
                duration = "Sept 21 - Sept 23",
                logo = Res.Drawable.BAJAJ_MARKETS
            )
        )
        add(
            ExperienceModel(
                designation = "Software Engineer",
                employerName = "Entrata",
                duration = "July 18 - Sept 21",
                logo = Res.Drawable.ENTRATA
            )
        )
        add(
            ExperienceModel(
                designation = "Software Engineer",
                employerName = "Veracity Software",
                duration = "OCt 17 - June 18",
                logo = Res.Drawable.VERACITY_SOFTWARE
            )
        )
    }

    fun getProjects() = ArrayList<ProjectModel>().apply {
        add(
            ProjectModel(
                logo = Res.Drawable.FIRST_DIRECT,
                name = "First Direct",
                skills = "Android, Core Java, Kotlin, Firebase, Git, Jira, Confluence",
                description = "A MobileBanking app developed for UK based First Direct bank. From checking your balances and viewing transactions to paying family and friends, mobile banking takes all the hassle out of everyday money stuff. User can now do more than ever from the comfort of your own phone. The user can get all updates related to his bank accounts through notifications.",
                appUrl = "https://play.google.com/store/apps/details?id=com.firstdirect.bankingonthego&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.BAJAJ_MARKETS,
                name = "Bajaj Markets",
                skills = "Android, Core Java, Kotlin, WebView, Firebase, Material Design, Git",
                description = "Bajaj Markets App from Bajaj Finserv Direct Ltd. is a one stop solution to all financial needs. This online loan app offers 100+ financial products by 80+ top financial institutions in India. With this personal loan app, you get quick loan approval & fast disbursal. The Bajaj Markets loan app offers Instant Loan, Credit Score, Credit Cards, Investments, Insurance & Personal Finance Manager all in one instant loan app.",
                appUrl = "https://play.google.com/store/apps/details?id=in.bajajfinservmarkets.app&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.BAJAJ_FINSERV,
                name = "Bajaj Finserv",
                skills = "Android, Core Java, Kotlin, Material Design, Jetpack, Git",
                description = "Bajaj Finserv App is trusted by 50 million+ customers all over India for their financial and payment needs. With this app, you can apply online for personal loan, home loan, gold loan, etc. You can shop offline from 1 million+ products at no-cost EMI, manage investments, get insurance, and do much more. You can also easily pay your utility bills, recharge mobile and transfer money using BHIM UPI.",
                appUrl = "https://play.google.com/store/apps/details?id=org.altruist.BajajExperia&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.ENTRATA_FACILITIES,
                name = "Entrata Facilities",
                skills = "Android, Kotlin, Jetpack, SVN, Firebase",
                description = "Entrata Facilities simplifies your work order management process. Quickly assign, manage, and close work orders while tracking the time it takes to complete them. This app was developed for the maintenance people who work in property management domain. This was my first project developed by using Kotlin programming language. This app also support offline storage.",
                appUrl = "https://play.google.com/store/apps/details?id=com.entrata.facilities&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.SMART_CAR,
                name = "Smart Car App",
                skills = "Android, Core Java, Kotlin, Jetpack Compose, Material Design, Git",
                description = "This project developed a mobile application for an IoT-based car tracking and monitoring system. Key features include real-time data acquisition like fuel level, speed, location, geofencing, remote engine start/stop, vehicle health diagnostics, trip history and crash reporting. These valuable insights into vehicle status and location, enhancing safety, security, and efficiency.",
                appUrl = "https://play.google.com/store/apps/details?id=in.bajajfinservmarkets.app&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = "",
                name = "",
                skills = "",
                description = "More on GitHub",
                appUrl = Res.String.GITHUB_URL
            )
        )
    }
}