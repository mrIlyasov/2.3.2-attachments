object WallService {
    private var posts = emptyArray<Post>()

    fun addPost(post: Post) {
        if (posts.size < 1)
            posts += post.copy(id = 1)
        else
            posts += post.copy(id = posts.last().id + 1)

    }

    fun printPosts() {
        for (index in posts.indices) {
            println(posts[index])
        }
    }
}