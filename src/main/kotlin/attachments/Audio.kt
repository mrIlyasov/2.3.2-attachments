package attachments

import Attachments

class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val url: String,
    override val type: String = "audio"
) : Attachments {

    override fun toString(): String {
        return "$artist - $title"
    }
}

data class AudioAttachment(
    val id: Int,
    val audio: Audio,
    override val type: String = "audio"
) :
    Attachments {
    override fun toString(): String {
        return audio.toString()
    }

}