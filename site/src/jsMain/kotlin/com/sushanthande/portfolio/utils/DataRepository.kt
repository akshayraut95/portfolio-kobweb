package com.sushanthande.portfolio.utils

import com.sushanthande.portfolio.models.ExperienceModel
import com.sushanthande.portfolio.models.LinkedinRecommendationModel
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
                skills = "Android, Core Java, Kotlin, Firebase, Git, Jira, Confluence, SAFE",
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
                skills = "Android, Kotlin, Jetpack, Firebase, SVN, Git, Agile",
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

    fun getMajorLinkedinRecommendation() = LinkedinRecommendationModel(
        profileImage = "images/linkedinrecommendations/vaibhava.jpeg",
        authorName = "Vaibhava Bajpai",
        designation = "Mobile Tech Lead",
        recommendation = "I rarely come across real talents who stand out like Sushant. I had the pleasure of working with Sushant. Sushant’s ability to handle multiple projects was unlike any I’ve seen before and made a dramatic increase in the productivity level of the company. Ability like technical problems, managing problems, no one can replace Sushant. No matter how tense a meeting, Sushant made sure everyone left with a smile. As a team member or a leader, he earns my highest recommendation.\n" +
                "\n" +
                "I wish Sushant all the very best !!!",
        recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=your%20future%20Sushant.-,Vaibhava%20Bajpai,-Vaibhava%20Bajpai"
    )

    fun getLinkedinRecommendations() = ArrayList<LinkedinRecommendationModel>().apply {
        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/rutuja.jpeg",
                authorName = "Rutuja Patil",
                designation = "Product Manager",
                recommendation = "I have been working with Sushant very closely as a Product Owner for the last 2 years and he has consistently impressed me with his technical skills and dedication to delivering top-notch mobile applications. He possesses a deep understanding of the Android platform and has a knack for paying close attention to detail and commitment to quality which is what I really admire him for. \n" +
                        "\n" +
                        "Sushant stays up to date with the latest industry trends and best practices, ensuring that the app is executed efficiently and meet high standards.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=expertise%20and%20commitment.-,Rutuja%20Patil,-Rutuja%20Patil"
            )
        )

        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/swapnali.jpeg",
                authorName = "Swapnali Yadav",
                designation = "Software Engineer QA",
                recommendation = "Sushant is highly skilled in advance and basics of kotlin Multiplatform, Java and Android Applications Development. I had the opportunity to work with Sushant, he is expert in technical and problem solving. Sushant possess a unique combination of technical expertise and strong interpersonal skills, which makes him a valuable asset to any team. He is always willing to take on new challenges, and he consistently demonstrate a strong work ethic and a commitment to excellence.\n" +
                        "In addition to his technical skills, he is an excellent communicator and has a natural ability to build relationships with clients and colleagues alike. \n" +
                        "He is highly skilled, very creative and confident enough to solve complex problems. He can work efficiently in a fact place environment and handle multiple projects at once.\n" +
                        "He has a strong track record of success and no doubt that he will continue to excel in his career. He is good and very passionate about his work. He can deal with any situation in a very cool way.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=Pending-,Swapnali%20Yadav,Swapnali%20Yadav,-%C2%B7%201st"
            )
        )

        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/reshma.jpeg",
                authorName = "Reshma TP",
                designation = "Senior Specialist iOS",
                recommendation = "Sushant and was consistently impressed by their strong technical expertise in Android technology. Their ability to tackle complex challenges and deliver innovative solutions was a significant asset to our team. Sushant not only excels in technical skills but also demonstrates exceptional teamwork and leadership. I highly recommend them for any opportunity that leverages their talents. During Hackathon development of idea and demonstrating in single day is extraordinary.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=very%20cool%20way.-,Reshma%20TP,-Reshma%20TP"
            )
        )

        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/budhbhushan.jpeg",
                authorName = "Buddhabhushan Naik",
                designation = "Android Developer",
                recommendation = "I have had the pleasure of working alongside Sushant at Entrata India, and I am truly impressed by his exceptional expertise and dedication in the field. In my professional journey, I have encountered numerous individuals, but Sushant stands out as one of the most astute and knowledgeable professionals I've ever had the privilege to collaborate with.\n" +
                        "\n" +
                        "What sets Sushant apart is not just his technical acumen, but also his commitment to delivering results that exceed expectations. He consistently goes above and beyond, showcasing a level of brilliance that has positively impacted our projects at Entrata. Sushant's ability to think critically and strategically sets him apart as a true leader in his field.\n" +
                        "\n" +
                        "Beyond his technical prowess, Sushant is a pleasure to work with. His collaborative spirit and willingness to share his knowledge make him not just a valuable team member but also a mentor to those fortunate enough to work alongside him.\n" +
                        "\n" +
                        "I wholeheartedly recommend Sushant to any organization seeking a brilliant mind coupled with a strong work ethic. He is, without a doubt, one of the cleverest professionals I have ever encountered in my career. Sushant would be an asset to any team or project fortunate enough to have him on board.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=of%20luck%2C%20Sushant-,Buddhabhushan%20Naik,-Buddhabhushan%20Naik"
            )
        )


        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/douglas.jpeg",
                authorName = "Douglas Fuller",
                designation = "iOS Developer",
                recommendation = "During our time working together, Sushant has demonstrated exceptional communication skills, raising any potential concerns with tasks early on. Following on from this, he works closely with the team to tackle any problems or obstacles to optimise working strategies on deliverables. He is happy to take the lead on actions where necessary and drives projects forward through to completion in a very effective way. It’s been a pleasure to work with Sushant and I highly recommend him in a Mobile Engineering capacity.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=in%20future%20endeavors.-,Douglas%20Fuller,-Douglas%20Fuller"
            )
        )


        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/heetkumar.jpeg",
                authorName = "Heetkumar Changela",
                designation = "Android Developer",
                recommendation = "I had the pleasure of working with Sushant, an exceptional Android developer with a deep understanding of Android technology. He is an excellent team player and an active contributor to open-source projects, always eager to enhance his skills. Sushant also demonstrates strong leadership capabilities and outstanding communication skills. His commitment to excellence and continuous learning in the Android field makes him a standout professional, and I highly recommend him.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=to%20any%20team.-,Heet%20Changela,-Heet%20Changela"
            )
        )

        add(
            LinkedinRecommendationModel(
                profileImage = "images/linkedinrecommendations/saurabh.jpeg",
                authorName = "Saurabh Rajput",
                designation = "iOS Developer",
                recommendation = "Sushant is an exceptional developer. He has all the qualities and skills you need in an excellent software developer. His depth of knowledge in languages like Kotlin and Java is extraordinary. It has been a great working experience with him. The best quality in Sushant is helping and caring for his teammates no matter how busy he is. I have learnt a lot from him whenever I was stuck in any problem he was always there to listen and suggest solutions. Thanks for everything and wish you all the best for your future Sushant.",
                recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=learner%20and%20honest.-,Saurabh%20Rajput,-Saurabh%20Rajput"
            )
        )

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/roufal.jpeg",
            authorName = "Roufal K.",
            designation = "Android Developer",
            recommendation = "I have worked with Sushant for the last 1year. It was nice a working period in my career with an extreme support from a dedicated and talended colleague.His work life always motivated me more to explore and upskill from the work place. Still feels alone on his absence when im starting my daily work. Hi's ideas always worked for winning our hackathons in every quarter.\n" +
                    "\n" +
                    "I had the pleasure of working alongside Sushant as Android developers at HSBC for the past year. During this time, he consistently demonstrated his technical expertise, creativity, and dedication to delivering high-quality mobile solutions. Sushant's deep knowledge of Android development, combined with his collaborative approach and strong problem-solving skills, made him a key contributor to the success of our projects. His attention to detail and passion for building intuitive, robust applications were evident in every task he undertook. Sushant was always proactive, going the extra mile to ensure project goals were met, and his contributions left a lasting positive impact on our team.",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=day%20is%20extraordinary.-,Roufal%20k,Roufal%20k,-%C2%B7%201st"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/gajanand.jpeg",
            authorName = "Gajanand Chouhan",
            designation = "Android Developer",
            recommendation = "I am pleased to recommend Sushant for their outstanding contributions and exceptional work. He consistently demonstrate a high level of expertise, dedication, and creativity in his role. He has significantly impacted our team with his innovative solutions and unwavering commitment to excellence. His work ethic, attention to detail, and collaborative spirit make him a valuable asset to any organization. I wholeheartedly endorse Sushant and am confident that he will continue to excel and drive success in future endeavors.",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=or%20software%20engineering.-,Gajanand%20Chouhan,-Gajanand%20Chouhan"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/mallika.jpeg",
            authorName = "Mallika Roy",
            designation = "Android Developer",
            recommendation = "I had the privilege of working with Sushant on multiple Android project, where he played a pivotal role as a senior team member. Sushant’s depth of knowledge in Android development and his leadership skills were truly impressive. As a senior developer, he not only delivered high-quality code but also guided the team through complex challenges with ease.\n" +
                    "\n" +
                    "Sushant's ability to break down complex problems and provide clear, actionable solutions made a significant impact on my learning experience. He was patient, approachable, and always eager to help others grow. His insights into best practices, coding standards, and project management were invaluable to my professional development.\n" +
                    "\n" +
                    "Beyond his technical skills, Sushant demonstrated excellent communication and teamwork, fostering a collaborative environment where everyone felt supported. His dedication, strategic thinking, and positive attitude were key to the project's success. I am grateful for the opportunity to have learned from Sushant, and I highly recommend him for any leadership role in Android development or software engineering.",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=our%20next%20collaboration!-,Mallika%20Roy,-Mallika%20Roy"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/abhay.jpeg",
            authorName = "Abhay Singh",
            designation = "iOS Developer",
            recommendation = "I had the pleasure of working with Sushant on several features of project, and I must say, it was an absolute delight! As an iOS developer, I appreciated his expertise in Android development, and together, we created seamless solutions. He is an exceptional team player, always willing to share knowledge and collaborate. I highly recommend him for any Android development projects. Looking forward to our next collaboration!",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=highly%20recommend%20him.-,Abhay%20Singh,-Abhay%20Singh"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/krishnendu.jpeg",
            authorName = "Krishnendu Manna",
            designation = "Android Developer",
            recommendation = "I had the pleasure of working with Sushant, an exceptionally talented Android developer, whose expertise and dedication are truly commendable. Sushant possesses a deep understanding of Android development, consistently delivering high-quality work and innovative solutions. His technical skills are complemented by his willingness to share knowledge and help others, making him an invaluable team member.\n" +
                    "\n" +
                    "Sushant’s ability to solve complex problems efficiently and his commitment to staying updated with the latest industry trends set him apart. He is not only proficient in coding but also excels in collaborating with cross-functional teams, ensuring seamless project execution. His positive attitude and proactive approach make him a great asset to any organization.\n" +
                    "\n" +
                    "I highly recommend Sushant for any role in Android development. His exceptional skills, coupled with his helpful nature, will undoubtedly contribute to the success of any project or team.",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=on%20their%20team%20.-,Krishnendu%20Manna,-Krishnendu%20Manna"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/neeraj.jpeg",
            authorName = "Neeraj Gupta",
            designation = "Android Developer",
            recommendation = "Sushant is a very hard-working person who can tackle any problem with ease. We have worked together on several projects, and I found him a highly skilled and dedicated professional. His expertise in the field of Mobile Application has helped our company immensely. He’s also an all-around great guy to work with! I highly recommend him to anyone looking for help on their team .",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=Mobile%20Engineering%20capacity.-,Neeraj%20Gupta,-Neeraj%20Gupta"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "images/linkedinrecommendations/vaishnavi.jpeg",
            authorName = "Vaishnavi Takawane",
            designation = "Web Developer",
            recommendation = "I had the opportunity to work with Sushant for past one year, and I can confidently say he is an exceptional Android developer with 6 years of solid experience. His deep expertise in Kotlin, coupled with his innovative mindset, consistently led to high-quality, efficient solutions. He always stayed on the cutting edge of technology and was eager to contribute to open-source projects, reflecting his passion for continuous learning and sharing knowledge with the developer community. I highly recommend Sushant to any team or organization looking for an Android developer who brings innovation, deep technical expertise, and a collaborative, positive attitude to the table.",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations/?detailScreenTabIndex=0#:~:text=on%20our%20team.-,Vaishnavi%20Takawane,-Vaishnavi%20Takawane"
        ))

        add(LinkedinRecommendationModel(
            profileImage = "",
            authorName = "",
            designation = "",
            recommendation = "More on LinkedIn",
            recommendationLink = "https://www.linkedin.com/in/sushanthande/details/recommendations"
        ))
    }
}