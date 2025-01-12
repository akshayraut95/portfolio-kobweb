package com.sushanthande.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.sushanthande.portfolio.HeroSectionStyle
import com.sushanthande.portfolio.IconsStyle
import com.sushanthande.portfolio.SkillIconStyle
import com.sushanthande.portfolio.SkillTitleStyle
import com.sushanthande.portfolio.components.widgets.SectionTitle
import com.sushanthande.portfolio.models.SkillModel
import com.sushanthande.portfolio.utils.DataRepository
import com.sushanthande.portfolio.utils.Res
import com.sushanthande.portfolio.utils.Res.String.SKILLS_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Skills() {

    Column(
        modifier = HeroSectionStyle.toModifier().id(SKILLS_TITLE), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(SKILLS_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = Modifier.height(30.px)) {}

        SimpleGrid(
            numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4),
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 12.px)
                .border(
                    0.1.px, LineStyle.Solid, Res.Colors.GREY
                )
                .borderRadius(r = 8.px)
        ) {
            DataRepository.getSkills().forEach {
                SkillItem(skillModel = it, Modifier)
            }
        }
    }
}

@Composable
fun SkillItem(skillModel: SkillModel, modifier: Modifier) {
    Column(IconsStyle.toModifier().then(modifier.fillMaxWidth().padding(20.px)), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            src = skillModel.drawable,
            modifier = SkillIconStyle.toModifier()
                .styleModifier {
                    mixBlendMode(MixBlendMode.Normal)
                }
        )

        SpanText(
            text = skillModel.title,
            modifier = SkillTitleStyle.toModifier()
                .padding(top = 10.px)
                .fontFamily(Res.Font.MONTSERRAT_SEMI_BOLD)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.GREEN_VOGUE
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
        )
    }
}