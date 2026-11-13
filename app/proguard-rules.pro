-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# Классы-мосты гейта (GateBridge/CloseBridge) и их члены сохраняем целиком.
-keep class iknow.yesino.app.presentation.gate.** { *; }

# WebView и его JS-интерфейс.
-keepclassmembers class android.webkit.WebView {
    public *;
}