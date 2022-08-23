package attachments

import Attachments

open class Photo(
    val id: Int,
    val ownerId: Int,
    val albumId: Int,
    val text: String,
    val date: Int,
    override val type: String = "photo"
) : Attachments {

    override fun toString(): String {
        return ("$id, Владелец: $ownerId, Альбом: $albumId, Подпись: $text, Дата публикации: $date")
    }
}

data class PhotoAtachment(
    val id: Int,
    val ownerId: Int,
    val albumId: Int,
    val text: String,
    val date: Int,
    override val type: String = "photo"
) : Attachments {

}
