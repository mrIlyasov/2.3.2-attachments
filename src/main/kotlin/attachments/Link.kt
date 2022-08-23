package attachments

import Attachments

open class Link(
    val caption: String,
    val url: String,
    val description: String,
    override val type: String = "link"
) : Attachments {

    override fun toString(): String {
        return ("Сслыка: $caption, Описание: $description , URL: $url")
    }
}

data class LinkAttachment(
    val caption: String,
    val url: String,
    val description: String,
    override val type: String = "link"
) : Attachments {

}