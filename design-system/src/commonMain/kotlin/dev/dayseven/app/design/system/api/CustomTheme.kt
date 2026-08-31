package dev.dayseven.app.design.system.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import dev.dayseven.app.design.system.colorscheme.ColorScheme
import dev.dayseven.app.design.system.colorscheme.LocalColorScheme
import dev.dayseven.app.design.system.typography.LocalTypography
import dev.dayseven.app.design.system.typography.Typography

object DaySevenTheme {
    val colorScheme: ColorScheme
        @Composable
        get() = LocalColorScheme.current

    val typography: Typography
        @Composable
        get() = LocalTypography.current
}

@Composable
fun CustomTheme(
    colorScheme: ColorScheme,
    typography: Typography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides typography
    ) {
        content()
    }
}