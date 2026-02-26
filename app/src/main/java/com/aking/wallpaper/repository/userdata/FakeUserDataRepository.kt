package com.aking.wallpaper.repository.userdata

import com.aking.wallpaper.model.UiTheme
import com.aking.wallpaper.model.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

/**
 * @author Ak
 * 2026/2/26  16:42
 */
class FakeUserDataRepository : UserDataRepository {
    override val userData: Flow<UserData> = flowOf(
        UserData(uiTheme = UiTheme.FOLLOW_SYSTEM)
    )

    override suspend fun setUiTheme(uiTheme: UiTheme) {}
}