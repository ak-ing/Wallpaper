package com.aking.wallpaper.core.data.userdata

import com.aking.wallpaper.core.model.UiTheme
import com.aking.wallpaper.core.model.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

/**
 * @author Ak
 * 2026/3/6  16:35
 */
class FakeUserDataRepository : UserDataRepository {
    override val userData: Flow<UserData> = flowOf(
        UserData(uiTheme = UiTheme.FOLLOW_SYSTEM)
    )

    override suspend fun setUiTheme(uiTheme: UiTheme) {}
}