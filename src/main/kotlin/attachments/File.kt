package attachments

import Attachments

open class File(
    val id: Int,
    val ownerId: Int,
    val size: Int,
    val title: String,
    val url: String,
    val ext: String,
    override val type: String = "file"
) : Attachments {
    override fun toString(): String {
        return ("Владелец: $ownerId , Размер файла: $size , Название: $title , Тип файла: $ext")
    }
}

data class FileAttchment(
    val id: Int,
    val file: File,
    override val type: String = "file"
) : Attachments {

}