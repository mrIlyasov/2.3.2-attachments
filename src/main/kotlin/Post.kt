data class Post(
    val id: Int,
    val ownerId: Int,
    var text: String,
    var attachments: Array<Attachments>,
    val date: Int
) {
    override fun toString(): String {
        return "$id, $ownerId, $text, $attachments"
    }


    fun printPost() {
        println("$id, $ownerId, $text")
        for (index in attachments.indices) {
            println(attachments[index])
        }
    }

    fun addAttachment(attachment: Attachments) {
        this.attachments += attachment
    }
}
