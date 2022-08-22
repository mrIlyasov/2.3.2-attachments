package attachments

import Attachments

open class File(
    val id: Int,
    val ownerId: Int,
    val size: Int,
    val title: String,
    val url: String,
    val ext: String
) : Attachments {
    override fun toString(): String {
        return ("Владелец: $ownerId , Размер файла: $size , Название: $title , Тип файла: $ext")
    }
}

class FileAttchment(
    id: Int,
    ownerId: Int,
    size: Int,
    title: String,
    url: String,
    ext: String,
    type: String = "File"
) : File(id, ownerId, size, title, url, ext) {

}