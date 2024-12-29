package com.sushanthande.portfolio.components

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.px

@Composable
fun RightSide(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((600 - 24).px)
            )
    ) {
        Box(
            modifier = Modifier
                .borderRadius(10.px).align(Alignment.Center).background(when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                    ColorMode.DARK -> Res.Colors.WHITE
                })
        ) {
            Image(
                modifier = Modifier
                    .height(400.px)
                    .width(350.px)
                    .clip(shape = Rect(0,10.px))
                    .align(Alignment.Center),
                src = "/sushant.png"
            )
        }
    }
}