package com.aking.wallpaper.ui.theme

import androidx.compose.ui.graphics.Color

// ==================== Primary - Green 主色调 - 绿色 ====================
// 用于活跃标签、导航指示器、开关、FAB 等核心交互元素

// Light 浅色主题
val PrimaryLight = Color(0xFF006D3A)              // 主色（深绿）
val OnPrimaryLight = Color(0xFFFFFFFF)            // 主色上的内容色（白色）
val PrimaryContainerLight = Color(0xFF5CFC93)     // 主色容器（亮绿，用于选中状态背景）
val OnPrimaryContainerLight = Color(0xFF005229)   // 主色容器上的内容色

// Dark 深色主题
val PrimaryDark = Color(0xFF34D880)               // 主色（亮绿）
val OnPrimaryDark = Color(0xFF00391B)             // 主色上的内容色（深绿）
val PrimaryContainerDark = Color(0xFF005229)      // 主色容器（深绿底）
val OnPrimaryContainerDark = Color(0xFF5CFC93)    // 主色容器上的内容色

// ==================== Secondary - Muted Green 次要色 - 灰绿 ====================
// 用于次要按钮、筛选标签、辅助信息等

// Light 浅色主题
val SecondaryLight = Color(0xFF4E6354)            // 次要色（灰绿）
val OnSecondaryLight = Color(0xFFFFFFFF)          // 次要色上的内容色
val SecondaryContainerLight = Color(0xFFD0E8D5)   // 次要色容器
val OnSecondaryContainerLight = Color(0xFF374B3D) // 次要色容器上的内容色

// Dark 深色主题
val SecondaryDark = Color(0xFFB4CCB9)             // 次要色（淡灰绿）
val OnSecondaryDark = Color(0xFF203528)           // 次要色上的内容色
val SecondaryContainerDark = Color(0xFF374B3D)    // 次要色容器
val OnSecondaryContainerDark = Color(0xFFD0E8D5)  // 次要色容器上的内容色

// ==================== Tertiary - Teal 第三色 - 青色 ====================
// 用于补充强调，与主色形成对比

// Light 浅色主题
val TertiaryLight = Color(0xFF3B6470)             // 第三色（青色）
val OnTertiaryLight = Color(0xFFFFFFFF)           // 第三色上的内容色
val TertiaryContainerLight = Color(0xFFBFE9F7)    // 第三色容器
val OnTertiaryContainerLight = Color(0xFF224C57)  // 第三色容器上的内容色

// Dark 深色主题
val TertiaryDark = Color(0xFFA3CDDB)              // 第三色（淡青）
val OnTertiaryDark = Color(0xFF044D59)            // 第三色上的内容色
val TertiaryContainerDark = Color(0xFF224C57)     // 第三色容器
val OnTertiaryContainerDark = Color(0xFFBFE9F7)   // 第三色容器上的内容色

// ==================== Error 错误色 ====================
// 用于错误提示、删除操作等

// Light 浅色主题
val ErrorLight = Color(0xFFBA1A1A)                // 错误色（红色）
val OnErrorLight = Color(0xFFFFFFFF)              // 错误色上的内容色
val ErrorContainerLight = Color(0xFFFFDAD6)       // 错误容器（浅红底）
val OnErrorContainerLight = Color(0xFF93000A)     // 错误容器上的内容色

// Dark 深色主题
val ErrorDark = Color(0xFFFFB4AB)                 // 错误色（浅红）
val OnErrorDark = Color(0xFF690005)               // 错误色上的内容色
val ErrorContainerDark = Color(0xFF93000A)        // 错误容器（深红底）
val OnErrorContainerDark = Color(0xFFFFDAD6)      // 错误容器上的内容色

// ==================== Background & Surface 背景与表面 ====================
// 页面背景、卡片、分类列表等大面积区域

// Light 浅色主题 - 浅绿白底
val BackgroundLight = Color(0xFFF5FBF5)           // 页面背景
val OnBackgroundLight = Color(0xFF171D19)         // 背景上的文字色
val SurfaceLight = Color(0xFFF5FBF5)              // 表面色（卡片等）
val OnSurfaceLight = Color(0xFF171D19)            // 表面上的文字色
val SurfaceVariantLight = Color(0xFFDCE5DC)       // 表面变体（输入框、芯片背景）
val OnSurfaceVariantLight = Color(0xFF404942)     // 表面变体上的文字色

// Dark 深色主题 - 深绿黑底
val BackgroundDark = Color(0xFF0F1512)            // 页面背景
val OnBackgroundDark = Color(0xFFDEE4DE)          // 背景上的文字色
val SurfaceDark = Color(0xFF0F1512)               // 表面色
val OnSurfaceDark = Color(0xFFDEE4DE)             // 表面上的文字色
val SurfaceVariantDark = Color(0xFF404942)        // 表面变体
val OnSurfaceVariantDark = Color(0xFFC0C9C0)      // 表面变体上的文字色

// ==================== Outline 轮廓线 ====================
// 用于边框、分割线

val OutlineLight = Color(0xFF707971)              // 轮廓线（浅色主题）
val OutlineVariantLight = Color(0xFFC0C9C0)       // 次要轮廓线（浅色主题）
val OutlineDark = Color(0xFF8A938B)               // 轮廓线（深色主题）
val OutlineVariantDark = Color(0xFF404942)        // 次要轮廓线（深色主题）

// ==================== Inverse 反转色 ====================
// 用于 Snackbar、Toast 等需要与当前主题反转的组件

val InverseSurfaceLight = Color(0xFF2C322D)       // 反转表面（浅色主题中显示深色）
val InverseOnSurfaceLight = Color(0xFFEDF2EC)     // 反转表面上的文字
val InversePrimaryLight = Color(0xFF34D880)       // 反转主色

val InverseSurfaceDark = Color(0xFFDEE4DE)        // 反转表面（深色主题中显示浅色）
val InverseOnSurfaceDark = Color(0xFF171D19)      // 反转表面上的文字
val InversePrimaryDark = Color(0xFF006D3A)        // 反转主色

// ==================== Surface Containers 表面容器层级 ====================
// 5 级容器层级，用于不同海拔的卡片、底部栏、对话框等

// Light 浅色主题
val SurfaceDimLight = Color(0xFFD5DBD6)           // 暗淡表面
val SurfaceBrightLight = Color(0xFFF5FBF5)        // 明亮表面
val SurfaceContainerLowestLight = Color(0xFFFFFFFF) // 最低层容器（纯白）
val SurfaceContainerLowLight = Color(0xFFEFF5EF)  // 低层容器
val SurfaceContainerLight = Color(0xFFE9EFE9)     // 标准容器
val SurfaceContainerHighLight = Color(0xFFE3EAE4) // 高层容器（对话框等）
val SurfaceContainerHighestLight = Color(0xFFDEE4DE) // 最高层容器

// Dark 深色主题
val SurfaceDimDark = Color(0xFF0F1512)            // 暗淡表面
val SurfaceBrightDark = Color(0xFF353B37)         // 明亮表面
val SurfaceContainerLowestDark = Color(0xFF0A100C) // 最低层容器（最深）
val SurfaceContainerLowDark = Color(0xFF171D19)   // 低层容器
val SurfaceContainerDark = Color(0xFF1B211D)      // 标准容器（分类卡片等）
val SurfaceContainerHighDark = Color(0xFF262B27)  // 高层容器（底部导航栏等）
val SurfaceContainerHighestDark = Color(0xFF303632) // 最高层容器（搜索框等）

// ==================== Scrim 遮罩 ====================
val Scrim = Color(0xFF000000)                     // 遮罩层（对话框背景遮罩）