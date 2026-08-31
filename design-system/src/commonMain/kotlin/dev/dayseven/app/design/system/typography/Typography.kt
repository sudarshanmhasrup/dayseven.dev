package dev.dayseven.app.design.system.typography

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle

@Immutable
data class Typography(
    val sampleType: TextStyle = TextStyle()
)

internal val LocalTypography = compositionLocalOf {
    Typography()
}