package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.components.LeftSide
import com.sushanthande.portfolio.components.RightSide
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.utils.Res
import com.sushanthande.portfolio.utils.Res.String.ABOUT_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun About(colorMode: ColorMode) {
    val breakpoint = rememberBreakpoint()

    Column (modifier = HeroSectionStyle.toModifier().id(ABOUT_TITLE), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        SectionTitle(ABOUT_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = Modifier.height(10.px)){}

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth()
                .thenIf(
                    condition = breakpoint > Breakpoint.MD,
                    other = Modifier.height(600.px)
                )
                .padding(all = 12.px)
                .border(0.1.px, LineStyle.Solid, when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                    ColorMode.DARK -> Res.Colors.WHITE
                })
                .borderRadius(r = 8.px)
        ) {
            LeftSide(colorMode = colorMode, breakpoint = breakpoint)
            RightSide(breakpoint = breakpoint)
        }
    }
}