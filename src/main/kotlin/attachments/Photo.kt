package attachments

import Attachments

open class Photo(
    val id: Int,
    val ownerId: Int,
    val albumId: Int,
    val text: String,
    val date: Int
) : Attachments {

    override fun toString(): String {
        return ("$id, Владелец: $ownerId, Альбом: $albumId, Подпись: $text, Дата публикации: $date")
    }
}

class PhotoAtachment(
    id: Int,
    ownerId: Int,
    albumId: Int,
    text: String,
    date: Int,
    val type: String = "photo"
) : Photo(id, ownerId, albumId, text, date) {

}
