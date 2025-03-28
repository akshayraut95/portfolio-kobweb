package com.sushanthande.portfolio.components

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.AboutSectionDesignationStyle
import com.sushanthande.portfolio.AboutSectionHeadingStyle
import com.sushanthande.portfolio.AboutTextStyle
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 40.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = AboutSectionHeadingStyle.toModifier()
                .margin(bottom = 12.px)
                .fontFamily(Res.Font.MONTSERRAT_EXTRA_BOLD)
                .color(if (colorMode.isLight) Res.Colors.GREEN_VOGUE else Res.Colors.WHITE)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = AboutSectionDesignationStyle
                .toModifier()
                .margin(bottom = 24.px)
                .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                .color(if (colorMode.isLight) Res.Colors.GREEN_VOGUE else Res.Colors.WHITE)
        )
        Surface(
            modifier = Modifier
                .height(2.px)
                .fillMaxWidth()
                .margin(bottom = 24.px)
                .background(
                    if (colorMode.isLight) Res.Colors.GREEN_VOGUE
                    else Res.Colors.WHITE
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = AboutTextStyle.toModifier()
                .fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                .color(if (colorMode.isLight) Res.Colors.GREEN_VOGUE else Res.Colors.WHITE)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    TextAlign.Justify
                ),
            text = Res.String.ABOUT_ME
        )
    }
}