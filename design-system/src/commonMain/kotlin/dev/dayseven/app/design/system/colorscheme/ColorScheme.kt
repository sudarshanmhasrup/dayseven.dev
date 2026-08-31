package dev.dayseven.app.design.system.colorscheme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ColorScheme(
    val sampleColor: Color = Color.Unspecified
)

internal val LocalColorScheme = compositionLocalOf {
    ColorScheme()
}