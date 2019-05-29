package mustafaozhan.github.com.androcat.model

import mustafaozhan.github.com.androcat.tools.Notification

data class Settings(
    var darkMode: Boolean? = false,
    var isFirstTime: Boolean? = true,
    var notificationList: ArrayList<Pair<Notification, Boolean>>? = null
)