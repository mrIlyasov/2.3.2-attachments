package attachments

import Attachments

open class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val url: String,
    val date: Int,
    override val type: String = "video"
) : Attachments {

    override fun toString(): String {
        return "$ownerId, Название: $title, Описание: $description, Длительность: $duration, $date"
    }
}

class VideoAttachment(
    id: Int,
    val video: Video,
    override val type: String = "Video"
) :
    Attachments {
    override fun toString(): String {
        return video.toString()
    }
}