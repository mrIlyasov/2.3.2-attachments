import attachments.Audio
import attachments.AudioAttachment
import attachments.Video
import attachments.VideoAttachment

fun main() {
    val audio = AudioAttachment(1, 1, "Филипп Киркоров", "Зайка моя", "www.vk.com")
    val audio2 = AudioAttachment(2, 2, "Король и Шут", "Ели мясо мужики", "www.vk.com")
    val video = VideoAttachment(1, 1, "Gangnam Style", "Первый видеоролик собравший 1_000_000_000 просмотров", 4, "www.vk.com", 2011)
    val post = Post(1, 1, "Хорошая музыка", arrayOf(), 2022)
    post.addAttachment(audio)
    post.addAttachment(audio2)
    post.addAttachment(video)
    post.printPost()
}