package attachments

import Attachments

open class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val url: String
) : Attachments {
}

class AudioAttachment(
    id: Int,
    ownerId: Int,
    artist: String,
    title: String,
    url: String,
    val type: String = "audio"
) :
    Audio(id, ownerId, artist, title, url) {
    override fun toString(): String {
        return "$artist - $title"
    }

}