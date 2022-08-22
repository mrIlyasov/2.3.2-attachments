package attachments

import Attachments

open class Link(
    val caption: String,
    val url: String,
    val description: String,
) : Attachments {

    override fun toString(): String {
        return ("Сслыка: $caption, Описание: $description , URL: $url")
    }
}

class LinkAttachment(
    caption: String,
    url: String,
    description: String
) : Link(caption, url, description) {}