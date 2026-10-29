package sklove.irwist.info.ui.theme

import androidx.compose.ui.graphics.Color
import sklove.irwist.info.ui.theme.Palette

// Based on the colors: #FE845C, #FECCB5, #FDD798, #FDC300, #FC9500
// A light theme — all five warm tones are too bright for text, so a dark burnt-orange
// brown is interpolated for the on-* roles, and a warm near-white carries the background;
// everything else maps directly onto the five given colors.
val AppPalette = Palette(
    primary = Color(0xFFFE845C),
    onPrimary = Color(0xFF4A2600),
    primaryContainer = Color(0xFFFECCB5),
    onPrimaryContainer = Color(0xFF4A2600),

    secondary = Color(0xFFFC9500),
    onSecondary = Color(0xFF4A2600),
    secondaryContainer = Color(0xFFFDD798),
    onSecondaryContainer = Color(0xFF4A2600),

    tertiary = Color(0xFFFDC300),
    onTertiary = Color(0xFF4A2600),
    tertiaryContainer = Color(0xFFFFE8A8),
    onTertiaryContainer = Color(0xFF4A2600),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    background = Color(0xFFFFF8F0),
    onBackground = Color(0xFF4A2600),

    surface = Color(0xFFFFF8F0),
    onSurface = Color(0xFF4A2600),

    surfaceVariant = Color(0xFFF5E0C8),
    onSurfaceVariant = Color(0xFF6B4423),

    surfaceTint = Color(0xFFFE845C),
    surfaceDim = Color(0xFFEDD9C0),
    surfaceBright = Color(0xFFFFFFFF),

    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFFFF1E2),
    surfaceContainer = Color(0xFFFBE3C4),
    surfaceContainerHigh = Color(0xFFF7D9AD),
    surfaceContainerHighest = Color(0xFFF2CB8E),

    outline = Color(0xFFA8672A),
    outlineVariant = Color(0xFFE8CBA0),

    inverseSurface = Color(0xFF4A2600),
    inverseOnSurface = Color(0xFFFFF1E2),
    inversePrimary = Color(0xFFFECCB5),

    scrim = Color(0xFF000000),
)
