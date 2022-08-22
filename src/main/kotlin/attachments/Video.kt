package attachments

import Attachments

open class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val url: String,
    val date: Int
) : Attachments {

    override fun toString(): String {
        return "$ownerId, Название: $title, Описание: $description, Длительность: $duration, $date"
    }
}

class VideoAttachment(
    id: Int,
    ownerId: Int,
    title: String,
    description: String,
    duration: Int,
    url: String,
    date: Int,
    val type: String = "Video"
) :
    Video(id, ownerId, title, description, duration, url, date) {

}