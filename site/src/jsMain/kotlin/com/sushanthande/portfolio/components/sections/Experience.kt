package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.models.ExperienceModel
import com.sushanthande.portfolio.utils.DataRepository
import com.sushanthande.portfolio.utils.Res
import com.sushanthande.portfolio.utils.Res.String.EXPERIENCE_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Experience() {
    Column(
        modifier = HeroSectionStyle.toModifier().id(EXPERIENCE_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(EXPERIENCE_TITLE.kebabCaseToTitleCamelCase())

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 3),
            modifier = Modifier.fillMaxWidth().padding(top = 20.px)
        ) {
            DataRepository.getExperiences().forEach { experienceItem ->
                ExperienceItem(experienceModel = experienceItem)
            }
        }
    }
}

@Composable
fun ExperienceItem(experienceModel: ExperienceModel, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.border(
            0.1.px, LineStyle.Solid, Res.Colors.GREY
        ).borderRadius(r = 8.px).padding(10.px).margin(10.px)
    ) {
        Column(modifier = Modifier.padding(10.px)) {
            SpanText(
                text = experienceModel.employerName,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                    .fontSize(15.px)
            )

            SpanText(
                text = experienceModel.designation,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                    .fontSize(12.5.px)
                    .margin(top = 5.px)
            )

            SpanText(
                text = experienceModel.duration,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                    .fontSize(12.5.px)
                    .margin(top = 5.px)
            )

            SpanText(
                text = Res.String.ROLE_AND_RESPONSIBILITIES.kebabCaseToTitleCamelCase(),
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                    .fontSize(13.5.px)
                    .margin(top = 10.px)
            )

            SpanText(
                text = experienceModel.roleAndResponsibilities,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                    .fontSize(12.5.px).margin(top = 5.px).textAlign(
                        TextAlign.Justify
                    )
            )
        }
    }
}