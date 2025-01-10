package com.sushanthande.portfolio

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariantBase
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.*

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 4.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

val NavHeaderStyle = CssStyle {
    base {
        Modifier
            .background(rgba(255, 255, 255, 0f))
            .gap(1.5.cssRem)
            .fillMaxWidth().padding(1.cssRem)
    }
}

val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}

val IconsStyle = CssStyle {
    hover {
        Modifier.scale(1.2)
    }
}

val ShareButtonStyle = CssStyle {
    hover {
        Modifier.cursor(Cursor.Pointer).scale(1.2)
    }
}

val HoverCursorStyle = CssStyle {
    hover {
        Modifier.cursor(Cursor.Pointer)
    }
}

val FooterStyle = CssStyle.base {
    Modifier.padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

val BackToTopButtonStyle = CssStyle {
    base {
        Modifier
            .size(50.px)
            .borderRadius(100.percent)
            .margin(
                right = 40.px,
                bottom = 40.px
            )
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                CSSTransition(
                    property = "translate",
                    duration = 200.ms, timingFunction = AnimationTimingFunction.Ease
                )
            )
    }
    hover {
        Modifier.translateY((-10).px)
    }
}

val SubHeadLineTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toPalette().color.toRgb())
}

val SectionTitleStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XXLarge)
    }
}

val SectionDescriptionStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XSmall)
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 1.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Large)
            .margin(topBottom = 2.cssRem)
    }
}

val ProfileImageStyle = CssStyle {
    base {
        Modifier
            .size(200.px)
            .borderRadius(100.percent)
            .margin(0.px)
    }
    Breakpoint.SM {
        Modifier.size(200.px)
    }
    Breakpoint.MD {
        Modifier.size(250.px)
    }
    Breakpoint.LG {
        Modifier.size(350.px)
    }
}

val ProfileHeadingStyle = CssStyle {
    base {
        Modifier
            .fontSize(20.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(25.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(30.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(40.px)
    }
}

val DesignationStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(18.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(22.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(25.px)
    }
}

val ResumeButtonStyle = CssStyle {
    base {
        Modifier
            .width(70.px)
            .height(30.px)
            .fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.width(80.px)
            .height(35.px)
            .fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.width(90.px)
            .height(40.px)
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier.width(100.px)
            .height(40.px)
            .fontSize(14.px)
    }

    hover {
        Modifier.scale(1.1)
    }
}

val NavigationMenuStyle = CssStyle {
    base {
        Modifier.fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.fontSize(14.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
}

val HeroSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .padding(top = 50.px)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 50.px)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 50.px)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .fontSize(2.75.cssRem)
            .padding(top = 50.px)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
    }
}

val HomeSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .height(100.vh)
            .padding(top = 50.px)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .height(100.vh)
            .padding(top = 50.px)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .height(100.vh)
            .padding(top = 50.px)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .height(100.vh)
            .padding(top = 50.px)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .height(100.vh)
    }
}

val AboutStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(50.vh)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(50.vh)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .fontSize(2.75.cssRem)
            .height(85.vh)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
    }
}