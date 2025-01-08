package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.ShareButtonStyle
import com.sushanthande.portfolio.utils.CustomColorSchemes
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.px

@Composable
fun Home(
    ctx: PageContext,
) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(Res.String.HOME_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier.clip(shape = Circle()).height(350.px).width(350.px).background(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
            ) {
                Image(
                    "/sushant.png", alt = "My image description",
                    modifier = Modifier.clip(shape = Circle()).height(350.px).width(350.px)
                )
            }

            SpanText(
                text = "Hey, It's Sushant Hande",
                modifier = Modifier.fontFamily(Res.Font.MONTSERRAT_EXTRA_BOLD)
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
                modifier = Modifier.fontSize(FontSize.XLarge)
                    .padding(top = 10.px)
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
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(40.px)
                ) {
                    FaLinkedin(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.LINKEDIN_URL) },
                        size = IconSize.XXS
                    )
                    FaGithub(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.GITHUB_URL) },
                        size = IconSize.XXS
                    )
                    FaXTwitter(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.X_URL) },
                        size = IconSize.XXS
                    )
                    FaMedium(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .onClick { ctx.router.navigateTo(Res.String.MEDIUM_URL) },
                        size = IconSize.XXS
                    )
                }

                Button(
                    onClick = {
                        ctx.router.navigateTo("https://www.linkedin.com/in/sushanthande/")
                    },
                    colorScheme = CustomColorSchemes.BlackAndWhite,
                    size = ButtonSize.MD,
                    modifier = ButtonStyle.toModifier().width(120.px)
                ) {
                    SpanText(
                        text = "Get in Touch",
                        modifier = Modifier.fontFamily()
                    )
                }
            }
        }
    }
}