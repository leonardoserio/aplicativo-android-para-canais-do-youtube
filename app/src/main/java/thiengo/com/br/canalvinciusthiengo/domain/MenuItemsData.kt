package thiengo.com.br.canalvinciusthiengo.domain

import android.content.res.Resources
import thiengo.com.br.canalvinciusthiengo.R

class MenuItemsData {

    companion object{

        const val NUMBER_COLUMNS = 1

        fun getItems( res: Resources )
            = listOf(
                MenuItem(
                    id = R.id.last_video,
                    label = res.getString( R.string.item_menu_last_video ),
                    icon = R.drawable.ic_circular_play,
                    isSelected =  MenuItemStatus.SELECTED
                ),
                MenuItem(
                    id = R.id.social_networks,
                    label = res.getString( R.string.item_menu_social_networks ),
                    icon = R.drawable.ic_social_networks
                ),
                MenuItem(
                    id = R.id.play_lists,
                    label = res.getString( R.string.item_menu_play_lists ),
                    icon = R.drawable.ic_play_lists
                ),
                MenuItem(
                    id = R.id.exclusive_groups,
                    label = res.getString( R.string.item_menu_exclusive_groups ),
                    icon = R.drawable.ic_groups
                ),
                MenuItem(
                    id = R.id.last_info,
                    label = res.getString( R.string.item_menu_last_info ),
                    icon = R.drawable.ic_info
                ),
                MenuItem(
                    id = R.id.about_channel,
                    label = res.getString( R.string.item_menu_about_channel ),
                    icon = R.drawable.ic_about
                ),
                MenuItem(
                    id = R.id.books,
                    label = res.getString( R.string.item_menu_books ),
                    icon = R.drawable.ic_books
                ),
                MenuItem(
                    id = R.id.courses,
                    label = res.getString( R.string.item_menu_courses ),
                    icon = R.drawable.ic_courses
                ),
                MenuItem(
                    id = R.id.business,
                    label = res.getString( R.string.item_menu_business ),
                    icon = R.drawable.ic_business
                )
            )
    }
}