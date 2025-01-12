package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.*
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Home(
    ctx: PageContext,
    breakpoint: Breakpoint
) {
    Column(
        modifier = HomeSectionStyle.toModifier().id(Res.String.HOME_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = ProfileImageStyle.toModifier().background(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
            ) {
                Image(
                    "/sushant.png", alt = "My image description",
                    modifier = ProfileImageStyle.toModifier().clip(shape = Circle())
                )
            }

            SpanText(
                text = "Hey, It's Sushant Hande",
                modifier = ProfileHeadingStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_EXTRA_BOLD)
                    .padding(top = 10.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    ),
            )

            SpanText(
                text = "Kotlin Multiplatfrom Developer",
                modifier = DesignationStyle.toModifier()
                    .margin(top = 10.px)
                    .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontWeight(FontWeight.Bold)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.margin(top = 15.px)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.margin(right = 5.px)
                ) {
                    FaLinkedin(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.LINKEDIN_URL) },
                        size = getIConSize(breakpoint)
                    )

                    FaGithub(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.GITHUB_URL) },
                        size = getIConSize(breakpoint)
                    )
                    FaXTwitter(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.X_URL) },
                        size = getIConSize(breakpoint)
                    )
                    FaMedium(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.MEDIUM_URL) },
                        size = getIConSize(breakpoint)
                    )
                }

                Box(
                    modifier = ResumeButtonStyle.toModifier()
                        .margin(left = 5.px)
                        .onClick { ctx.router.navigateTo("https://www.linkedin.com/in/sushanthande/") }
                        .border(0.1.px, LineStyle.Solid, Res.Colors.GREY)
                        .borderRadius(r = 5.px)
                        .background(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                                ColorMode.DARK -> Res.Colors.WHITE
                            }
                        )

                ) {
                    SpanText(
                        text = "Resume",
                        modifier = Modifier
                            .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                            .align(Alignment.Center)
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.WHITE
                                    ColorMode.DARK -> Res.Colors.GREEN_VOGUE
                                }
                            )
                    )
                }
            }
        }
    }
}

fun getIConSize(breakpoint: Breakpoint): IconSize {
    return when (breakpoint) {
        Breakpoint.ZERO -> IconSize.LG

        Breakpoint.SM -> IconSize.LG

        Breakpoint.MD -> IconSize.LG

        Breakpoint.LG -> IconSize.XL

        Breakpoint.XL -> IconSize.XXL
    }
}