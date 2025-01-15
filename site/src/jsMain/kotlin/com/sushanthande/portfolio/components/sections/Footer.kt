package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.FooterStyle
import com.sushanthande.portfolio.PageContentStyle
import com.sushanthande.portfolio.ShareButtonStyle
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun Footer(
    modifier: Modifier
) {
    val ctx = rememberPageContext()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = FooterStyle.toModifier().fillMaxSize().margin(top = 1.cssRem, bottom = 1.cssRem).backgroundColor(
            Res.Colors.GREEN_VOGUE
        )
            .then(modifier),
    ) {
        Row(PageContentStyle.toModifier().fillMaxWidth()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(5.px).fillMaxWidth()
            ) {
                FaLinkedin(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.LINKEDIN_URL) },
                    size = IconSize.XL
                )
                FaGithub(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.GITHUB_URL) },
                    size = IconSize.XL
                )
                FaXTwitter(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.X_URL) },
                    size = IconSize.XL
                )
                FaMedium(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.MEDIUM_URL) },
                    size = IconSize.XL
                )
            }
        }

        SpanText(
            text = "Copyright © 2025 Sushant Hande. All rights reserved.",
            modifier = Modifier
                .fillMaxWidth()
                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                .textAlign(TextAlign.Center)
                .color(
                    Res.Colors.WHITE
                )
                .fontSize(15.px)
        )

        SpanText(
            text = Res.String.VERSION,
            modifier = Modifier
                .fillMaxWidth()
                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                .textAlign(TextAlign.Center)
                .color(
                    Res.Colors.GREY
                )
                .fontSize(11.px)
                .margin(top = 10.px)
        )
    }
}
